package com.example.servicesStaffEnquiry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityStaffEnquiry.Followup;
import com.example.repositoryStaffEnquiry.FollowupRepository;


@Service
public class FollowupManagerImp implements FollowupManager{
	@Autowired
	FollowupRepository followuprepo;

	@Override
	public void addFollowup(Followup f1) {
		// TODO Auto-generated method stub
		followuprepo.save(f1);
	}

	@Override
	public List<Followup> getFollowup() {
		// TODO Auto-generated method stub
		return followuprepo.findAll();
	}

	@Override
	public void deletefollowup(int id) {
		// TODO Auto-generated method stub
		followuprepo.deleteById(id);
	}

	@Override
	public Optional<Object[]> findEnquiryWithFollowup() {
		// TODO Auto-generated method stub
		return followuprepo.findEnquiryWithFollowup();
	}

}
