package com.example.repositoryCourseBatchStd;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entityCourseBatchStd.Student;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	
	
}