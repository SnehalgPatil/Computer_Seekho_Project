package com.example.entityCourseBatchStd;

import java.util.Set;

import com.example.entityGallary.Videos;
import com.example.entityPayment.Payment;
//import com.example.entityPayment.PaymentMaster;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;



@Entity
public class Batch 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int batch_id;
	private String batchname;
	private Date batch_start_date;
	private Date batch_end_date;
	private boolean batch_is_active = true;
	private Date final_presentation_data;
	
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "batch_id")
	
//	@OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
//	private Set<Student> students;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="batch_id" )
//	private Set<PaymentMaster> payment_master;

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name = "batch_id")
	//@OneToMany(mappedBy = "Batch", cascade = CascadeType.ALL)
	//private Set<Payment> payments;
	
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="batch_id")
//	private List<Videos> videos;


	public int getBatch_id() {
		return batch_id;
	}


	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}


	public String getBatchname() {
		return batchname;
	}


	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}



	public Date getBatch_start_date() {
		return batch_start_date;
	}


	public void setBatch_start_date(Date batch_start_date) {
		this.batch_start_date = batch_start_date;
	}


	public Date getBatch_end_date() {
		return batch_end_date;
	}


	public void setBatch_end_date(Date batch_end_date) {
		this.batch_end_date = batch_end_date;
	}


	public boolean isBatch_is_active() {
		return batch_is_active;
	}


	public void setBatch_is_active(boolean batch_is_active) {
		this.batch_is_active = batch_is_active;
	}


	public Date getFinal_presentation_data() {
		return final_presentation_data;
	}


	public void setFinal_presentation_data(Date  final_presentation_data) {
		this.final_presentation_data = final_presentation_data;
	}


//	public Set<Student> getStudents() {
//		return students;
//	}
//
//
//	public void setStudents(Set<Student> students) {
//		this.students = students;
//	}


//	public Set<PaymentMaster> getPayment_master() {
//		return payment_master;
//	}
//
//
//	public void setPayment_master(Set<PaymentMaster> payment_master) {
//		this.payment_master = payment_master;
//	}


//	public Set<Payment> getPayments() {
//		return payments;
//	}
//
//
//	public void setPayments(Set<Payment> payments) {
//		this.payments = payments;
//	}


//	public List<Videos> getVideos() {
//		return videos;
//	}
//
//
//	public void setVideos(List<Videos> videos) {
//		this.videos = videos;
//	}


	
}