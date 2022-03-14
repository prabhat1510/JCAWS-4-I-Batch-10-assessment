package com.springassesment.entities;

import java.util.List;

public class Consumer {
	
	private Integer collegeId;
	private String collegeName;
	private String address;
	private List<Student> studentList;
	
	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Consumer [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address
				+ ", studentList=" + studentList + "]";
	}
	
	
	
	
}
