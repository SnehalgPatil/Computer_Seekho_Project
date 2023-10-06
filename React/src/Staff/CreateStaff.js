import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function CreateStaff() {
  const [staff, setStaff] = useState({
    staff_name: "",
    staff_mobile: "",
    staff_email: "",
    staff_role: "",
    staff_username: "",
    staff_password: "",
    staff_isactive: true, // Default to 'Active'
  });

  const navigate = useNavigate();

  const handleChange = (event) => {
    const { name, value } = event.target;
    setStaff((prevStaff) => ({
      ...prevStaff,
      [name]: value,
    }));
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    // Convert the staff data to JSON
    const jsonData = JSON.stringify(staff);

    // Send a POST request to your API
    fetch("http://localhost:8080/api/Staff/PostStaff", {
      method: "POST",
      headers: {
        "Content-type": "application/json",
      },
      body: jsonData,
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("Failed to add staff.");
        }
        return response.json();
      })
      .then((data) => {
        // Handle success, e.g., show a success message
        alert("New Staff Added Successfully!");
        navigate(-1); // Navigate back to the previous page
      })
      .catch((error) => {
        // Handle errors, e.g., show an error message
        console.error(error);
        alert("Failed to add staff. Please try again.");
      });
  };

  return (
    <>
      <h3 align="center">Add New Staff</h3>
      <form onSubmit={handleSubmit}>
        <label>Name:</label>
        <input
          type="text"
          name="staff_name"
          value={staff.staff_name}
          onChange={handleChange}
          required
        />
        <br />
        <label>Mobile:</label>
        <input
          type="text"
          name="staff_mobile"
          value={staff.staff_mobile}
          onChange={handleChange}
          required
        />
        <br />
        <label>Email:</label>
        <input
          type="text"
          name="staff_email"
          value={staff.staff_email}
          onChange={handleChange}
          required
        />
        <br />
        <label>Role:</label>
        <select
          name="staff_role"
          value={staff.staff_role}
          onChange={handleChange}
        >
          <option value="Teacher">Teacher</option>
          <option value="Office_Staff">Office-Staff</option>
          <option value="Housekeeping">Housekeeping</option>
          <option value="Admin">Admin</option>
        </select>
        <br />
        <label>Username:</label>
        <input
          type="text"
          name="staff_username"
          value={staff.staff_username}
          onChange={handleChange}
          required
        />
        <br />
        <label>Password:</label>
        <input
          type="text"
          name="staff_password"
          value={staff.staff_password}
          onChange={handleChange}
          required
        />
        <br />
        <label>Active Status:</label>
        <div>
          <label>
            <input
              type="radio"
              name="staff_isactive"
              value="true"
              checked={staff.staff_isactive === true}
              onChange={handleChange}
            />{" "}
            Active
          </label>
          <label>
            <input
              type="radio"
              name="staff_isactive"
              value="false"
              checked={staff.staff_isactive === false}
              onChange={handleChange}
            />{" "}
            Inactive
          </label>
        </div>
        <br />
        <input type="submit" value="Add Staff" />
      </form>
      <br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
      <br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
    </>
  );
}

export default CreateStaff;
