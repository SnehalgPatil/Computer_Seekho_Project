package com.example.entityStaffEnquiry;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int enquiry_id;
	private String enquirer_name,enquirer_address,enquirer_query,closure_reason;
	private String enquirer_mobile,enquirer_alternate_mobile,Student_Name;
	@Column(unique = true)
	private String enquirer_email_id;
	private Date enquiry_date;
	@OneToOne(cascade = CascadeType.ALL)
	private ClosureReasonMaster Closure_ReasonID;
	private boolean enquiry_processed_flag;
    private int inquiry_counter;
    private Date Follow_up_date;
    public Set<Followup> getFollowup() {
		return followup;
	}
	public void setFollowup(Set<Followup> followup) {
		this.followup = followup;
	}
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "enquiry_id", referencedColumnName="enquiry_id")
    private Set<Followup> followup;
	public int getEnquiry_id() {
		return enquiry_id;
	}
	public void setEnquiry_id(int enquiry_id) {
		this.enquiry_id = enquiry_id;
	}
	public String getEnquirer_name() {
		return enquirer_name;
	}
	public void setEnquirer_name(String enquirer_name) {
		this.enquirer_name = enquirer_name;
	}
	public String getEnquirer_address() {
		return enquirer_address;
	}
	public void setEnquirer_address(String enquirer_address) {
		this.enquirer_address = enquirer_address;
	}
	public String getEnquirer_query() {
		return enquirer_query;
	}
	public void setEnquirer_query(String enquirer_query) {
		this.enquirer_query = enquirer_query;
	}
	public String getClosure_reason() {
		return closure_reason;
	}
	public void setClosure_reason(String closure_reason) {
		this.closure_reason = closure_reason;
	}
	public String getEnquirer_mobile() {
		return enquirer_mobile;
	}
	public void setEnquirer_mobile(String enquirer_mobile) {
		this.enquirer_mobile = enquirer_mobile;
	}
	public String getEnquirer_alternate_mobile() {
		return enquirer_alternate_mobile;
	}
	public void setEnquirer_alternate_mobile(String enquirer_alternate_mobile) {
		this.enquirer_alternate_mobile = enquirer_alternate_mobile;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getEnquirer_email_id() {
		return enquirer_email_id;
	}
	public void setEnquirer_email_id(String enquirer_email_id) {
		this.enquirer_email_id = enquirer_email_id;
	}
	public Date getEnquiry_date() {
		return enquiry_date;
	}
	public void setEnquiry_date(Date enquiry_date) {
		this.enquiry_date = enquiry_date;
	}
	
	public ClosureReasonMaster getClosure_ReasonID() {
		return Closure_ReasonID;
	}
	public void setClosure_ReasonID(ClosureReasonMaster closure_ReasonID) {
		Closure_ReasonID = closure_ReasonID;
	}
	public boolean isEnquiry_processed_flag() {
		return enquiry_processed_flag;
	}
	public void setEnquiry_processed_flag(boolean enquiry_processed_flag) {
		this.enquiry_processed_flag = enquiry_processed_flag;
	}
	public int getInquiry_counter() {
		return inquiry_counter;
	}
	public void setInquiry_counter(int inquiry_counter) {
		this.inquiry_counter = inquiry_counter;
	}
	public Date getFollow_up_date() {
		return Follow_up_date;
	}
	public void setFollow_up_date(Date follow_up_date) {
		Follow_up_date = follow_up_date;
	}
//	@Override
//	public String toString() {
//		return "Enquiry [enquiry_id=" + enquiry_id + ", enquirer_name=" + enquirer_name + ", enquirer_address="
//				+ enquirer_address + ", enquirer_query=" + enquirer_query + ", closure_reason=" + closure_reason
//				+ ", enquirer_mobile=" + enquirer_mobile + ", enquirer_alternate_mobile=" + enquirer_alternate_mobile
//				+ ", Student_Name=" + Student_Name + ", enquirer_email_id=" + enquirer_email_id + ", enquiry_date="
//				+ enquiry_date + ", Closure_ReasonID=" + Closure_ReasonID + ", enquiry_processed_flag="
//				+ enquiry_processed_flag + ", inquiry_counter=" + inquiry_counter + ", Follow_up_date=" + Follow_up_date
//				+ "]";
//	}
    
}
