package com.example.servicesStaffEnquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityStaffEnquiry.ClosureReasonMaster;
import com.example.repositoryStaffEnquiry.ClosureReasonMasterRepository;


@Service
public class ClosureReasonMasterManagerImp implements ClosureReasonMasterManager{
	@Autowired
	ClosureReasonMasterRepository reason;
	@Override
	public void addReason(ClosureReasonMaster c1) {
		// TODO Auto-generated method stub
		reason.save(c1);
	}

	@Override
	public List<ClosureReasonMaster> getReason() {
		// TODO Auto-generated method stub
		return reason.findAll();
	}

}
