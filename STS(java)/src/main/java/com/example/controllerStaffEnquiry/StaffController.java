package com.example.controllerStaffEnquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityStaffEnquiry.Staff;
import com.example.servicesStaffEnquiry.StaffManagerImpl;



@RestController
@CrossOrigin("*")
public class StaffController {
	@Autowired
	StaffManagerImpl manager;
	@GetMapping(value ="api/getstaff")
	 public List<Staff> show()
	 {
		
		  return manager.getStaff(); 
		
	 }
	@PostMapping(value ="api/addstaff")
	 public void add(@RequestBody Staff s1)
	 {
		
		manager.addStaff(s1);
	 }
	@DeleteMapping(value = "api/deletestaff/{staff_id}")
	 public void removestaff(@PathVariable int staff_id)
	 {
		manager.delete(staff_id);
	 }
}