


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

import com.example.entityCourseBatchStd.Student;
import com.example.servicesCourseBatchStd.StudentManagerImpl;

import jakarta.annotation.PostConstruct;

@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentManagerImpl manager;
	
	@GetMapping("api/getStudents")
	public List<Student> getStudents()
	{
		return manager.getStudents();
	}
	@PostMapping("api/addStudents")
	public void addStudent(@RequestBody Student s)
	{
		manager.addStudent(s);
	}
	@GetMapping(value= "api/studentId/{studentid}")
	public Optional<Student> getStudent(@PathVariable int studentid)
	{
		Optional<Student> s=manager.getStudents(studentid);
		return s;
	}
	@DeleteMapping("api/studentId/{studentid}")
	public void removepro (@PathVariable int studentid)
	{
		manager.delete(studentid);
	}

	

}
