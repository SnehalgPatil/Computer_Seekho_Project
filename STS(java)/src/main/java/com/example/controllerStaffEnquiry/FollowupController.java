package com.example.controllerStaffEnquiry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityStaffEnquiry.Followup;
import com.example.servicesStaffEnquiry.FollowupManagerImp;


@RestController
@CrossOrigin("*")
public class FollowupController {
	@Autowired
	FollowupManagerImp folloup;
	@GetMapping(value = "/getFollowup")
	public List<Followup>get()
	{
		return folloup.getFollowup();
	}
	@PostMapping(value = "/addFollowup")
	public void add(Followup f1)
	{
		folloup.addFollowup(f1);
	}
	@PostMapping(value = "/delete/{id}")
	public void deletebyid(@PathVariable int id)
	{
		folloup.deletefollowup(id);
	}
	@GetMapping(value = "/getFollowups")
	public Optional<Object[]>getDetails()
	{
		return folloup.findEnquiryWithFollowup();
	}
}
