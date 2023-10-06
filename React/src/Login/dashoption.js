// import Container from 'react-bootstrap/Container';

import { Link} from 'react-router-dom';
import "../CSS/Dash.css"
import {  Col, Button } from 'reactstrap';


function Dashoption() {


  return (
    <> 
      <Col md="12">
        <div className="button-container" >
          <Button  tag={Link} to="/followups">Followups</Button>
          <Button  tag={Link} to="/addenq">Add Enquiry</Button>
          <Button  tag={Link} to="/allenq">All Enquiry</Button>
          {/* <Button  tag={Link} to="/newreg">New Student</Button> */}
          <Button  tag={Link} to="/studlist">Student List</Button>
          <Button  tag={Link} to="/placerecord">Placement</Button>
          <Button  tag={Link} to="/batch">Batch</Button>
          <Button  tag={Link} to="/PaymentList">Payment</Button>
          <Button  tag={Link} to="/allstaff">Staff</Button>
          
        </div>
      </Col>


    </>
      );
}

      export default Dashoption;