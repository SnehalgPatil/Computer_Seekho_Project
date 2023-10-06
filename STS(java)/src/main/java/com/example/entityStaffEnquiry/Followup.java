package com.example.entityStaffEnquiry;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Followup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int followup_id;
	
	private String followup_msg;
	
	private boolean is_active;
	
	private boolean followup_is_success;
	
	
	public int getFollowup_id() {
		return followup_id;
	}
	public void setFollowup_id(int followup_id) {
		this.followup_id = followup_id;
	}
	public String getFollowup_msg() {
		return followup_msg;
	}
	public void setFollowup_msg(String followup_msg) {
		this.followup_msg = followup_msg;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public boolean isFollowup_is_success() {
		return followup_is_success;
	}
	public void setFollowup_is_success(boolean followup_is_success) {
		this.followup_is_success = followup_is_success;
	}
//	@Override
//	public String toString() {
//		return "Followup [followup_id=" + followup_id + ", followup_msg=" + followup_msg + ", is_active=" + is_active
//				+ ", followup_is_success=" + followup_is_success + "]";
//	}
}
