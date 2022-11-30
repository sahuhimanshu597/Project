import React from 'react'


const AboutUsScreen = (props) => {
  return (
    <div className="Screen">
      <Header title="About Us"/>
      <div className="info">
        <div className="row">
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Vision</h5>
            <p>
              To be an independent, innovative, honest and sustainable company in which customers are able to choose from a wide range of products at reasonable prices.
            </p>
          </div>
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Mission</h5>
            <p>To satisfy our customers with a unique shopping experience offering quality products, variety of categories, fair price and best service,</p>
          </div>
          {/* <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Serving At</h5>
            <ul>
            <table Style="width: 100%">
                <tr>
                  <td><li></li></td>
                  <td>Sangli</td>
                  <td> Shivaji nagar, College Corner </td>
                  <td className="text-center"> 10:00 to 19:00 Hrs</td>
                </tr>

                <tr>
                  <td><li></li></td>
                  <td>Pune</td>
                  <td> Gokhale chowk, Magarpatta, PCMC </td>
                  <td className="text-center"> 09:00 to 23:00 Hrs</td>
                </tr>

                <tr>
                  <td><li></li></td>
                  <td>L.A.</td>
                  <td> Malibu, North Point Mall </td>
                  <td className="text-center"> 09:00 to 22:00 Hrs</td>
                </tr>
              </table>
            </ul>
          </div> */}
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Values</h5>
            <ul>
              <li>To listen to the customers,the employees and to our environment,to provide products,information,and welfare</li> and 
              <li>to be responsible through commitment, and respect.</li>
            </ul>
          </div>
          <hr/>
          <div className="col-md-12 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Ease of Shopping</h5>
            <p>
            No matter what your favourite sport is,  has a wide selection of sports gear and equipment. It is your online football store, a place to buy basketballs online and also the perfect destination to buy swimming costumes online. Whether you wish to get hold of branded badminton racquets, shuttlecocks, cricket bats, balls or kitbags, we offer a fabulous collection of branded products.<br/>
            we are committed to offer authentic branded products at the most affordable rates. It has firmly placed us as one of the best online sports stores in India. You will find a wide range of products from renowned brands.<br/>
            Buy authentic products from renowned brands and rest assured about its quality.

            </p>
          </div>

        </div>
      </div>
    </div>
  )
}

export default AboutUsScreen
