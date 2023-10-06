package com.example.controllerCourseBatchStd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityCourseBatchStd.Course;
import com.example.servicesCourseBatchStd.CourseManager;



@RestController
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	private CourseManager c_manager;
	
	@GetMapping(value="/api/getCourse")
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		    return c_manager.getCourse();
	}

	
	/*public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		      c_manager.updateCourse(course);
	}*/

	
	
	@GetMapping(value="/api/getCourse/{id}")
	public Optional<Course> getCourseById(@PathVariable int id) {
		// TODO Auto-generated method stub
		      return c_manager.getCourseById(id);
	}

	


	@PostMapping(value="/api/addCourse")
	public void addCourse(@RequestBody Course course) {
		   c_manager.addCourse(course);
		
	}
	
	@DeleteMapping(value ="/api/deleteCourse/{ID}")
	public void deleteCourse(@PathVariable int ID) {
		c_manager.deleteCourse(ID);
	}
	

}
