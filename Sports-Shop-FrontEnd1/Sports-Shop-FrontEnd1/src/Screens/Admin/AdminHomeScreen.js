import React from "react";
import { useSelector } from "react-redux";
import Header from "../../Components/Header";
import Admin from "./Admin.webp"
const AdminHomeScreen = (props) => {
  const userSignIn = useSelector((store) => store.userSignIn);
  return (
    <div>
    
    <div className="Screen"style={{ backgroundImage:`url(${Admin})`,height:'100vh',marginTop:'5px',width:'182vh',backgroundSize: 'cover'}}>
      {!userSignIn.response && <Header title="You are not logged in" />}
      {userSignIn.response && (
        <Header title={"Welcome " + userSignIn.response.data.firstName} />
      )}
    </div>
    </div>
  );
};

export default AdminHomeScreen;
