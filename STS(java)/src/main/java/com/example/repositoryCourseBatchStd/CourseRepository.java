package com.example.repositoryCourseBatchStd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entityCourseBatchStd.Course;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course,Integer>{

	/*@Query(value="select * from Student  where student_Id in(select sid from phone where phone_number=:phonenumber)",nativeQuery = true)
	Student getStudent(@Param("phonenumber")String phonenumber);*/
}
