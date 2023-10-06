import React, { useState, useEffect } from 'react';
import { Container, Row, Col, Form } from 'react-bootstrap';
import { Button } from 'react-bootstrap';
import Map from './map';
import { useNavigate } from 'react-router-dom';

function ContactUs() {
  const [staffList, setStaffList] = useState([]);
  const [currentStaffIndex, setCurrentStaffIndex] = useState(0);
  const [enquiryData, setEnquiryData] = useState({
    enquirer_name: '',
    enquirer_mobile: '',
    enquirer_email_id: '',
    enquirer_query: '',
  });

  useEffect(() => {
    // Fetch staff data when the component mounts
    fetchStaffData();
  }, []);

  const fetchStaffData = async () => {
    try {
      const response = await fetch('http://localhost:8080/api/Staff/GetStaff'); // Replace with your API endpoint for staff data
      const staffData = await response.json();
      setStaffList(staffData);
    } catch (error) {
      console.error('Error fetching staff data:', error);
    }
  };

  let navigate = useNavigate();

  const getNextStaff = () => {
    const nextStaffIndex = (currentStaffIndex + 1) % staffList.length;
    setCurrentStaffIndex(nextStaffIndex);
    return staffList[nextStaffIndex];
  };

  const handleEnquirySubmit = async (e) => {
    e.preventDefault();

    const selectedStaff = getNextStaff();

    if (!selectedStaff) {
      console.error('No staff found');
      return;
    }

    const enrichedEnquiryData = {
      ...enquiryData,
      staff_id: selectedStaff.staff_id,
      enquiry_date: new Date().toISOString().split('T')[0],
      follow_up_date: new Date().toISOString().split('T')[0],
      enquiry_processed_flag: false,
    };

    try {
      const response = await fetch('http://localhost:8080/api/Enquiry/new_enquiry', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(enrichedEnquiryData),
      });

      if (response.ok) {
        // Enquiry successfully stored
        console.log('Enquiry stored successfully');
        // Clear the form fields
        setEnquiryData({
          enquirer_name: '',
          enquirer_mobile: '',
          enquirer_email_id: '',
          enquirer_query: '',
        });
        navigate('/');
      } else {
        console.error('Failed to store enquiry');
      }
    } catch (error) {
      console.error('Error storing enquiry:', error);
    }
  };

  return (
    <Container>
      <br />
      <br />
      <br />
      <br />
      <Row className="mt-4">
        <Col lg={6}>
          <h2 align="center">Enquiry Form</h2>
          <Form onSubmit={handleEnquirySubmit}>
            <label>Name:</label>
            <input
              type="text"
              value={enquiryData.enquirer_name}
              onChange={(e) => setEnquiryData({ ...enquiryData, enquirer_name: e.target.value })}
            />
            <label>Mobile:</label>
            <input
              type="text"
              value={enquiryData.enquirer_mobile}
              onChange={(e) => setEnquiryData({ ...enquiryData, enquirer_mobile: e.target.value })}
            />
            <label>Email:</label>
            <input
              type="text"
              value={enquiryData.enquirer_email_id}
              onChange={(e) => setEnquiryData({ ...enquiryData, enquirer_email_id: e.target.value })}
            />
            <label>Query:</label>
            <input
              type="text"
              value={enquiryData.enquirer_query}
              onChange={(e) => setEnquiryData({ ...enquiryData, enquirer_query: e.target.value })}
            />
            <Button variant="primary" type="submit" className="mt-3">
              Submit
            </Button>
          </Form>
        </Col>

        {/* MAP */}
        <Col lg={6}>
          <Map />
        </Col>
      </Row>
    </Container>
  );
}

export default ContactUs;
