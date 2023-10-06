package com.example.entityCourseBatchStd;

import java.util.*;

import com.example.entityPayment.Payment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String student_name;
	private String student_address;
	private String student_gender;
	private Date student_dob;
	private String student_qualification;
	private String student_mobile;
	private String student_email;
	private double total_amount;

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="student_id", referencedColumnName = "student_id" )
//	private Set<PaymentMaster> payment_master;

	

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name = "student_id" , referencedColumnName = "student_id")
	 @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Payment> payments;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="batch_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    private Batch batch;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Set<PaymentMaster> getPayment_master() {
//		return payment_master;
//	}
//
//	public void setPayment_master(Set<PaymentMaster> payment_master) {
//		this.payment_master = payment_master;
//	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}

	

	public Date getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}

	

	public String getStudent_qualification() {
		return student_qualification;
	}

	public void setStudent_qualification(String student_qualification) {
		this.student_qualification = student_qualification;
	}

	public String getStudent_mobile() {
		return student_mobile;
	}

	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}

	

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
	

}