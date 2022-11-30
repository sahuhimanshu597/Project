import blog1 from "./blog1.jfif";
import blog2 from "./blog2.jpg";
import blog3 from "./blog3.jfif";

export default function Cards() {
  return (
    <section
      class="portfolio"
      style={{
        backgroundImage:
          "linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12)",
      }}
    >
      <div class="container text-center ">
        <h1>CATEGORIES </h1>
        <br />
        <div class="row">
          <div class="col-lg-4 col-md-4 col-sm-12 col-10 d-block m-auto">
            <div class="card">
              <img
                src={blog1}
                class="card img-fluid"
                style={{ width: "415.99px", height: "250px" }}
              />
              <div class="card body ">
                <h5 ass="card-title">
                WOMEN
                </h5>
                <p class="card-text text-left">
               
                </p>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-4 col-sm-12 col-10 d-block m-auto">
            <div class="card">
              <img
                src={blog2}
                class="card img-fluid"
                style={{ width: "415.99px", height: "250px" }}
              />
              <div class="card body">
                <h5 class="card-title">
                MEN
                </h5>
               
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-4 col-sm-12 col-10 d-block m-auto">
            <div class="card">
              <img
                src={blog3}
                class="card img-fluid"
                style={{ width: "415.99px", height: "250px" }}
              />
              <div class="card body">
                <h4 class="cards-title">
               SPORT ITEMS
                </h4>
                
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}