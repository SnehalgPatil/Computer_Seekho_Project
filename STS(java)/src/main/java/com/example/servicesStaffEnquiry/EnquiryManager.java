package com.example.servicesStaffEnquiry;

import java.util.List;
import java.util.Optional;

import com.example.entityStaffEnquiry.*;

public interface EnquiryManager {
	void addEnquiry(Enquiry e1);
	List<Enquiry>getEnquiry();
	void deleteEnquiry(int id);
	void deleteall();
	void updateEnquiry(Enquiry e,int id);
	Optional<Enquiry>getbyIdEnquiry(int id);
}
