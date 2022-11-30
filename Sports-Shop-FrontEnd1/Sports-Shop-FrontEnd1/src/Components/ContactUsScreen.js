import React from 'react'

import Header from '../../Components/Header'

const ContactUsScreen = (props) => {
    return (
        <div className="Screen">
            <Header title="Contact Us" />

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

                        {/* <div className="row" Style="padding: 5px;">
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">Ashish Jain</strong><br/>
                                <label className="fs-7">Store Manager</label><br/>
                                <label className="fs-7">ashish.jain@grocers.com</label>
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">Grocers, Suratwala plaza</strong><br/>
                                <label className="fs-7">Shivaji chowk</label><br/>
                                <label className="fs-7">Hinjewadi - 411057</label><br/>
                                <label className="fs-7">Maharashtra | India</label>
                                
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12" Style="padding: 15px;">
                                <strong className="fs-5"> Contact </strong><br/>
                                <label className="fs-7"> 9632587410 </label><br/>
                                <label className="fs-7"> 020-22651311 </label><br/>
                                <label className="fs-7"> 1800-9090-5544 </label>
                            </div>
                        </div>
                        <hr/>

                        <div className="row" Style="padding: 5px;">
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">Mike Ross</strong><br/>
                                <label className="fs-7">Store Manager</label><br/>
                                <label className="fs-7">mike.ross@grocers.com</label>
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12 Block" Style="padding: 15px;">
                                <strong className="fs-5">740 S, Olive street</strong><br/>
                                <label className="fs-7">South Hampshire</label><br/>
                                <label className="fs-7">North Carolina - 121277</label><br/>
                                <label className="fs-7">L.A. | U.S.A</label>
                                
                            </div>
                            <div className="col-md-4 col-sm-12 col-xs-12" Style="padding: 15px;">
                                <strong className="fs-5"> Contact </strong><br/>
                                <label className="fs-7"> +1 885511471 </label><br/>
                                <label className="fs-7"> 1008520010 </label><br/>
                                <label className="fs-7"> 1800-9090-5544 </label>
                            </div>
                        </div>
    */}
                    </div>
                </div>
 
                <div className="col-md-6 col-sm-12 col-xs-12">
                    <h5 className="text-center">
                        Let us get back to you
                    </h5>
                    <hr/>
                    <div>
                        <br/><br/>
                        <div className="mb-3" Style="padding:5px">
                            <h6>Name</h6>
                            <input className="form-control" type="text" placeholder="Your name" />
                        </div>
                        <div className="mb-3" Style="padding:5px">
                            <h6>Email</h6>
                            <input className="form-control" type="email" placeholder="you@gmail.com" />
                        </div>
                        <div className="mb-3" Style="padding:5px">
                            <h6>Contact</h6>
                            <input className="form-control" type="number" placeholder="Your mobile" />
                        </div>
                        <div className="mb-3" Style="padding:5px">
                            <h6>What would you like to know?</h6>
                            <textarea  rows="3" className="form-control" type="text" placeholder="" />
                        </div>
                        <div className="mb-3 text-center">
                            <button type="button" className="btn btn-outline-success">Submit</button>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
    )
}

export default ContactUsScreen
