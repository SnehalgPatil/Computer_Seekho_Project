import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css'; // Import Bootstrap CSS
//import './PaymentCreate.css'; // You can create your custom CSS file for additional styling

export default function PaymentCreate(props) {
  const [payment, setPayment] = useState({});
  const navigate = useNavigate();

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.type === "checkbox" ? event.target.checked : event.target.value;

    setPayment((prevPayment) => ({
      ...prevPayment,
      [name]: value
    }));
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    
    let demo = JSON.stringify(payment);
    fetch("http://localhost:8080/api/postPayment", {
      method: "POST",
      headers: { "Content-type": "application/json" },
      body: demo
    })
      .then((res) => {
        console.log("Payment created successfully");
        navigate('/PaymentList');
      })
      .catch((error) => {
        console.error("Error creating payment:", error);
      });
  };

  return (
    <div className="container mt-4">
      <h2>Create Payment</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="payment_transaction_id">Payment Transaction ID:</label>
          <input type="text" className="form-control" id="payment_transaction_id" name="payment_transaction_id" onChange={handleChange} />
        </div>

        <div className="form-group">
          <label htmlFor="payment_date">Payment Date:</label>
          <input type="date" className="form-control" id="payment_date" name="payment_date" onChange={handleChange} />
        </div>

        <div className="form-group form-check">
          <input type="checkbox" className="form-check-input" id="payment_done" name="payment_done" onChange={handleChange} />
          <label className="form-check-label" htmlFor="payment_done">Payment Done</label>
        </div>

        <div className="form-group form-check">
          <input type="checkbox" className="form-check-input" id="payment_receipt_send" name="payment_receipt_send" onChange={handleChange} />
          <label className="form-check-label" htmlFor="payment_receipt_send">Payment Receipt Send</label>
        </div>

        <div className="form-group">
          <label htmlFor="amount">Amount:</label>
          <input type="number" className="form-control" id="amount" name="amount" onChange={handleChange} />
        </div>

        <div className="form-group">
          <label htmlFor="payment_type">Payment Type:</label>
          <select className="form-control" id="payment_type" name="payment_type" onChange={handleChange}>
            <option value="Credit Card">Credit Card</option>
            <option value="Debit Card">Debit Card</option>
            <option value="Cash">Cash</option>
            <option value="Demand Draft">Demand Draft</option>
          </select>
        </div>

        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
}
