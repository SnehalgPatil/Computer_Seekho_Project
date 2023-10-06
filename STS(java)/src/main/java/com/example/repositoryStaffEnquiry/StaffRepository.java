package com.example.repositoryStaffEnquiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entityStaffEnquiry.Staff;

import jakarta.transaction.Transactional;

//@Repository
//@Transactional
public interface StaffRepository extends JpaRepository<Staff,Integer>{
	 
	@Modifying
	@Query(value = "UPDATE staff s SET s.staff_name = :staffname, s.staff_role = :role WHERE s.staff_id = :staffId",nativeQuery = true)
	void updateStaff(@Param("staffId") int staffId, @Param("staffname")String staffname, @Param("role") String role);
	}

