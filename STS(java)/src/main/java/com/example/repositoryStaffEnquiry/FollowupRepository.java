package com.example.repositoryStaffEnquiry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entityStaffEnquiry.*;

public interface FollowupRepository extends JpaRepository<Followup, Integer> {

	@Query(value = "SELECT e.enquiry_id,e.enquirer_name,e.student_name,e.enquirer_mobile,e.enquirer_query,e.follow_up_date,s.staff_name FROM Enquiry e ,Staff s where e.staff_id = s.staff_id order by e.follow_up_date ",nativeQuery = true)
	Optional<Object[]>findEnquiryWithFollowup();
}
