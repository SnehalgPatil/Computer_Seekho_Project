package com.example.repositoryStaffEnquiry;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entityStaffEnquiry.*;

import jakarta.transaction.Transactional;

@Transactional
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> {
	
//	@Modifying
//	@Query(value="update Enquire e set e.enquirer_name=:enquirer_name,e.enquirer_email_id=:enquirer_email_id,e.enquirer_mobile=:enquirer_mobile,e.enquirer_alternate_mobile=:enquirer_alternate_mobile,e.enquirer_address=:enquirer_address,e.enquirer_query=:enquirer_query,e.enquiry_date=:enquiry_date,e.enquiry_processed_flag=:enquiry_processed_flag,e.inquiry_counter=:inquiry_counter,e.Follow_up_date=:Follow_up_date where e.enquiry_id=:enquiry_id",nativeQuery = true)
//	void update(@Param("enquirer_name")String enquirer_name,@Param("enquirer_email_id")String enquirer_email_id,@Param("enquirer_mobile")String enquirer_mobile,@Param("enquirer_alternate_mobile")String enquirer_alternate_mobile,@Param("enquirer_address")String enquirer_address,@Param("enquirer_query")String enquirer_query,@Param("enquiry_date")Date date,@Param("enquiry_processed_flag")boolean b,@Param("inquiry_counter")int i,@Param("Follow_up_date")Date date2,@Param("enquiry_id")int enquiry_id);
	@Modifying
	@Query(value="update Enquiry e set e.enquirer_name=:enquirer_name,e.enquirer_email_id=:enquirer_email_id,e.enquirer_mobile=:enquirer_mobile,e.enquirer_alternate_mobile=:enquirer_alternate_mobile,e.enquirer_address=:enquirer_address,e.enquirer_query=:enquirer_query,e.enquiry_date=:enquiry_date,e.enquiry_processed_flag=:enquiry_processed_flag,e.inquiry_counter=:inquiry_counter,e.Follow_up_date=DATE_ADD(enquiry_date, INTERVAL 3 DAY) where e.enquiry_id=:enquiry_id",nativeQuery = true)
	void update(@Param("enquirer_name")String enquirer_name,@Param("enquirer_email_id")String enquirer_email_id,@Param("enquirer_mobile")String enquirer_mobile,@Param("enquirer_alternate_mobile")String enquirer_alternate_mobile,@Param("enquirer_address")String enquirer_address,@Param("enquirer_query")String enquirer_query,@Param("enquiry_date")Date date,@Param("enquiry_processed_flag")boolean b,@Param("inquiry_counter")int i,@Param("enquiry_id")int enquiry_id);



}
