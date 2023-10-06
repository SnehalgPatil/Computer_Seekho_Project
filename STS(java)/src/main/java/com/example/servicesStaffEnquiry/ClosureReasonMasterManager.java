package com.example.servicesStaffEnquiry;

import java.util.List;

import com.example.entityStaffEnquiry.ClosureReasonMaster;



public interface ClosureReasonMasterManager {
	void addReason(ClosureReasonMaster c1);
	List<ClosureReasonMaster>getReason();
}
