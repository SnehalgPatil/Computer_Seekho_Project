package com.example.servicesStaffEnquiry;

import java.util.List;
import java.util.Optional;

import com.example.entityStaffEnquiry.*;

public interface FollowupManager {
	void addFollowup(Followup f1);
	List<Followup>getFollowup();
	void deletefollowup(int id);
	Optional<Object[]>findEnquiryWithFollowup();
}