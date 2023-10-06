package com.example.servicesCourseBatchStd;

import java.util.List;
import java.util.Optional;

import com.example.demo.*;
import com.example.entityCourseBatchStd.Course;
import com.example.repositoryCourseBatchStd.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseMangerImpl implements CourseManager 
{
	@Autowired
	private CourseRepository repository;
	
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	/*public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		return repository.updatedata();
	}*/

	
	@Override
	public Optional<Course> getCourseById(int id) {
		return repository.findById(id);
	}

	

	

	@Override
	public void addCourse(Course course) {
		 repository.save(course);
		
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	

	


}
