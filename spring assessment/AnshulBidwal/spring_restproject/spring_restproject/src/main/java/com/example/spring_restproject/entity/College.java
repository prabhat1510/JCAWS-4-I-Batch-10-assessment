package com.example.spring_restproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private String collegeName;
	private Integer collegeId;
	private String address;

	public College(String collegeName, Integer collegeId, String address) {
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeId=" + collegeId + ", address=" + address + "]";
	}

}
