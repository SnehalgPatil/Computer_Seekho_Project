package com.example.servicesCourseBatchStd;
import java.util.List;
import java.util.Optional;

import com.example.entityCourseBatchStd.Student;



public interface StudentManager 
{
	List<Student> getStudents();
	void addStudent(Student s);
	Optional<Student> getStudents(int id);
	void delete(int id );
	List<Student> getAll();
	
}