import React from 'react'



const ContactUsScreen = (props) => {
    return (
        <div className="Screen">
           

            <div className="row">
                <div className="col-md-6 col-sm-12 col-xs-12 Block">
                    <h5 className="text-center">
                        Reach out to us here
                    </h5>
                    <hr/>
                    <div className="col-md-12 col-sm-12 col-xs-12 ">
                        
                        <div className="row" Style="padding: 5px;">
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">Sportify Sports limited</strong><br/>
                                <label className="fs-7">Customer Executive</label><br/>
                                <label className="fs-7">sportify@gmail.com</label>
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">Address</strong><br/>
                                <label className="fs-7">Innovation Park</label><br/>
                                <label className="fs-7">Panchawati,Pashan</label><br/>
                                <label className="fs-7">Pune - 411008</label><br/>
                                <label className="fs-7">Maharashtra | India</label>
                                
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12" Style="padding: 15px;">
                                <strong className="fs-5"> Contact </strong><br/>
                                <label className="fs-7"> +91 9900112233 </label><br/>
                                <label className="fs-7"> +91 9900112244 </label><br/>
    
                            </div>
                        </div>
                        <hr/>

                        
                    </div>
                </div>
 
                
            </div>
            
        </div>
    )
}

export default ContactUsScreen
