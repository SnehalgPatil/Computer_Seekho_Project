package com.example.entityCourseBatchStd;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.Mapping;

import com.example.entityGallary.Videos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int course_id;
	private String course_name;
	private int course_duration;
	private int course_fees;
	private String course_syllabus;
	private String age_grp_type;
	private boolean course_is_active=true;
	private String cover_photo;
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id", referencedColumnName="course_id")
	private Set<Batch> batches;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id", referencedColumnName="course_id")
	private Set<Student> Student;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public int getCourse_fees() {
		return course_fees;
	}

	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}

	public String getCourse_syllabus() {
		return course_syllabus;
	}

	public void setCourse_syllabus(String course_syllabus) {
		this.course_syllabus = course_syllabus;
	}

	public String getAge_grp_type() {
		return age_grp_type;
	}

	public void setAge_grp_type(String age_grp_type) {
		this.age_grp_type = age_grp_type;
	}

	public boolean isCourse_is_active() {
		return course_is_active;
	}

	public void setCourse_is_active(boolean course_is_active) {
		this.course_is_active = course_is_active;
	}

	public String getCover_photo() {
		return cover_photo;
	}

	public void setCover_photo(String cover_photo) {
		this.cover_photo = cover_photo;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}

	public Set<Student> getStudent() {
		return Student;
	}

	public void setStudent(Set<Student> student) {
		Student = student;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

	
	
		
	
}