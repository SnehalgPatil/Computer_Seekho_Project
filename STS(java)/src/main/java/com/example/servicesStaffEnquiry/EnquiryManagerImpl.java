package com.example.servicesStaffEnquiry;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityStaffEnquiry.Enquiry;
import com.example.repositoryStaffEnquiry.EnquiryRepository;


@Service
public class EnquiryManagerImpl implements EnquiryManager {
	@Autowired
	EnquiryRepository erepository;
	
	@Override
	public void addEnquiry(Enquiry e1) {
		// TODO Auto-generated method stub
		erepository.save(e1);
	}

	@Override
	public List<Enquiry> getEnquiry() {
		// TODO Auto-generated method stub
		return erepository.findAll();
	}

	@Override
	public void deleteEnquiry(int id) {
		// TODO Auto-generated method stub
		erepository.deleteById(id);
	}

	@Override
	public void deleteall() {
		// TODO Auto-generated method stub
		erepository.deleteAll();
	}

	@Override
	public void updateEnquiry(Enquiry e, int id) {
		// TODO Auto-generated method stub
		erepository.update(e.getEnquirer_name(), e.getEnquirer_email_id(), e.getEnquirer_mobile(), e.getEnquirer_alternate_mobile(), e.getEnquirer_address(), e.getEnquirer_query(), e.getEnquiry_date(), e.isEnquiry_processed_flag(),e.getInquiry_counter(), id);
		}

	@Override
	public Optional<Enquiry> getbyIdEnquiry(int id) {
		// TODO Auto-generated method stub
		return erepository.findById(id);
	}

	


}
