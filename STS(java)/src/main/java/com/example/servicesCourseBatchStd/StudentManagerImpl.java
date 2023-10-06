package com.example.servicesCourseBatchStd;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityCourseBatchStd.*;
import com.example.repositoryCourseBatchStd.StudentRepository;



@Service
public class StudentManagerImpl implements StudentManager 
{
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getStudents() {
		
		return repository.findAll();
	}
	@Override
//	public void addStudent(Student s) {
//		// TODO Auto-generated method stub
//		repository.save(s);
//	}
//	
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		int batchId = s.getBatch().getBatch_id();
        Batch batch = new Batch();
        batch.setBatch_id(batchId);
        s.setBatch(batch);

        repository.save(s);
		
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Optional<Student> getStudents(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
	

}