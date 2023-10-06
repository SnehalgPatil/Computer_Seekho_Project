package com.example.servicesCourseBatchStd;

import java.util.List;
import java.util.Optional;

import com.example.entityCourseBatchStd.Course;


public interface CourseManager
{
	 void addCourse(Course course);
	 Optional<Course> getCourseById(int id);
	 List<Course>getCourse();
	 //void updateCourse(Course course);
	 void deleteCourse(int id);
	 
	 
	 
}