import React from 'react'
import { Link } from "react-router-dom";

/* const Footer = () => {
    return (
        <div className="footer">
            <h6>Developed By Grocers</h6>
        </div>
    )
} */

function Footer() {
    return (
      <div>
        <footer class="bg-dark text-white ">
          <div class="container text-center text-md-left">
            <div class="row text-center text-md-left">
              <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
                <h5 class="text-uppercase mb-4 font-weight-bold text-info">
                  Sportify
                </h5>
                <p>
                Discover our sports clothing, including Sportswear, Running, Football, and futsal collections, 
                to follow your steps in every moment in life.
                </p>
              </div>
  
              <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
                <h5 class="text-uppercase mb-4 font-weight-bold text-info">
                  Follow us on
                </h5>
                <p>
                  <a
                    style={{ textDecoration: "none", color: "white" }}
                    href="#"
                    class="text-white"
                  >
                   <i class="bi bi-twitter"></i> @SportifyOfficial
                   
                  </a>
                </p>
                <p>
                  <a
                    style={{ textDecoration: "none", color: "white" }}
                    href="#"
                    class="text-white"
                  >
                  <i class="bi bi-facebook"></i> @SportifyShop 
                    
                  </a>
                </p>
              </div>
  
              <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mt-3">
                <h5 class="text-uppercase mb-4 font-weight-bold text-info">
                  Useful links
                </h5>
                <p>
                  <Link
                    style={{ textDecoration: "none", color: "white" }}
                    to="/"
                    class="text-white"
                  >
                    HOME
                  </Link>
                </p>
               
                
                <p>
                  <Link
                    style={{ textDecoration: "none", color: "white" }}
                    to="/about"
                    class="text-white"
                  >
                    About
                  </Link>
                </p>
              </div>
  
              <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
                <h5 class="text-uppercase mb-4 font-weight-bold text-info">
                  Contact
                </h5>
                <p>
                  <i class="fa fa-home mr-3"></i>Innovation Park,Pune, Maharashtra
                </p>
                <p>
                  <i class="fa fa-envelope mr-3"></i>sportify@gmail.com
                </p>
                <p>
                  <i class="fa fa-phone mr-3"></i>+91 9900112233
                </p>
                <p>
                  <i class="fa fa-phone mr-3"></i>+91 9900112244
                </p>
              </div>
            </div>
  
            <hr class="mb-4" />
  
            <div class="row align-items-center">
              <div class="col-md-7 col-lg-12 m-auto">
                <p>
                  Copyright ©2022 All rights reserved by :
                  <a
                    style={{ textDecoration: "none", color: "white" }}
                  >
                    <h6 class="text-info">Group 04 CDAC Pune</h6>
                  </a>
                </p>
              </div>
            </div>
          </div>
        </footer>
      </div>
    );
  } 
  

export default Footer
