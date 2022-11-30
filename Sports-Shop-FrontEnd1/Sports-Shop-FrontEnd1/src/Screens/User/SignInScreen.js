/* eslint-disable react-hooks/exhaustive-deps */
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { useDispatch, useSelector } from "react-redux";
import { signin } from "../../Actions/userActions";
import Header from "../../Components/Header";
import {toast} from 'react-toastify'
import SignIn from "./SignIn.jpeg"

const SignInScreen = (props) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const dispatch = useDispatch();

  const { loading, response, error } = useSelector((store) => store.userSignIn);

  const onSignIn = () => {
    dispatch(signin(email, password));
  };

  useEffect(() => {
    if (response && response.status === "success") {
      sessionStorage.setItem("Authorization", "Bearer " + response.token);
      if (response.data.role === "ADMIN") {
        props.history.push("/admin-home");
      } else if (response.data.role === "EMPLOYEE") {
        props.history.push("/employee-home");
      } else if (response.data.role === "CUSTOMER") {
        props.history.push("/customer-home");
      } else if (response.data.role === "DELIVERY_PERSON") {
        props.history.push("/delivery-home");
      }
    }
    else if(error){
      toast.error('Invalid Login Credentials. Try again!!',{autoClose:2000,position:toast.POSITION.TOP_RIGHT})
    }
  }, [loading, response, error]);

  return (
    
   
    <div className="Screen"style={{ backgroundImage:`url(${SignIn})`,height:'100vh',marginTop:'5px',width:'182vh',backgroundSize: 'cover'}}>
      <Header title="Login Page" />
      
      <div className="SignIn col-md-9.5 offset-md-4">
      <div className="mb-3 col-md-6">
        
        <label className="form-label"><b>Email Address</b></label>
        <input
          onChange={(e) => {
            setEmail(e.target.value);
          }}
          type="email"
          style={{width:'60vh'}}
         
          className="form-control"
          placeholder="name@example.com"
       
        />
      </div>

      <div className="mb-3 col-md-6">
        <label className="form-label"><b>Password</b></label>
        <input
          onChange={(e) => {
            setPassword(e.target.value);
          }}
          style={{width:'60vh'}}
          type="password"
          className="form-control"
          placeholder="*******"
        />
      </div>

      <div className="hi">
          
          <b>New around here?</b> <button className="btn-light text-light"><Link to="/signup">Sign Up</Link></button>
      </div>

      <div className="mb-3 col-md-6">
        <button onClick={onSignIn} className="btn btn-primary text-light">
          Login
        </button>
      </div>
    </div>
    </div>
    
  );
};

export default SignInScreen;