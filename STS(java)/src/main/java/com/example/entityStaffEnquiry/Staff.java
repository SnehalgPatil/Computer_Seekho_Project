package com.example.entityStaffEnquiry;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int staff_id;
	private String staff_name;
	private String photo_url;
	private int staff_mobile;
	private String staff_email;
	private String username;
	private String password;
	private String staff_role;
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id", referencedColumnName="staff_id")
	private Set<Followup> followup;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id", referencedColumnName="staff_id")
	private Set<Enquiry> Enquiry;
	
	
	public Set<Followup> getFollowup() {
		return followup;
	}
	public Set<Enquiry> getEnquiry() {
		return Enquiry;
	}
	public void setEnquiry(Set<Enquiry> enquiry) {
		Enquiry = enquiry;
	}
	public void setFollowup(Set<Followup> followup) {
		this.followup = followup;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}
	public int getStaff_mobile() {
		return staff_mobile;
	}
	public void setStaff_mobile(int staff_mobile) {
		this.staff_mobile = staff_mobile;
	}
	public String getStaff_email() {
		return staff_email;
	}
	public void setStaff_email(String staff_email) {
		this.staff_email = staff_email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStaff_role() {
		return staff_role;
	}
	public void setStaff_role(String staff_role) {
		this.staff_role = staff_role;
	}
	//@Override
	//public String toString() {
//		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", photo_url=" + photo_url + ", staff_mobile="
//				+ staff_mobile + ", staff_email=" + staff_email + ", username=" + username + ", password=" + password
//				+ ", staff_role=" + staff_role + "]";
	//}

}

