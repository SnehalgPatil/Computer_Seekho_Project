package com.example.controllerStaffEnquiry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityStaffEnquiry.Enquiry;
import com.example.servicesStaffEnquiry.EnquiryManagerImpl;



@RestController
@CrossOrigin("*")
public class EnquiryController {
	@Autowired
	EnquiryManagerImpl enquirer;
	@GetMapping(value="/getEnquiry")
	public List<Enquiry>get()
	{
		return enquirer.getEnquiry();
	}
	@GetMapping(value = "/getByIdEnquiry/{id}")
    public Optional<Enquiry> getById(@PathVariable int id)
    {
		return enquirer.getbyIdEnquiry(id);
    }
	
	@PostMapping(value="/addEnquiry")
	public void add(@RequestBody Enquiry e)
	{
		enquirer.addEnquiry(e);
	}
	@DeleteMapping(value="/deleteEnquiry/{id}")
	public void deletebyid(@PathVariable int id)
	{
		enquirer.deleteEnquiry(id);	
	}
	@PostMapping(value = "/deleteall")
	public void deleteall()
	{
		enquirer.deleteall();
	}
	@PutMapping(value = "/updateEnquiry/{id}")
	public void updatebyid(@RequestBody Enquiry e,@PathVariable int id)
	{
		enquirer.updateEnquiry(e, id);
	}
}
