package com.example.servicesStaffEnquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityStaffEnquiry.Staff;
import com.example.repositoryStaffEnquiry.StaffRepository;


@Service
public class StaffManagerImpl implements StaffManager{
	@Autowired
	StaffRepository repository;
	@Override
	public void addStaff(Staff s1) {
		repository.save(s1);
	}
	@Override
	public List<Staff> getStaff() {
			// TODO Auto-generated method stub
		return repository.findAll();
			
	}
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

}