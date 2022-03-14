package com.collegemanagementrestapp.consumer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.collegemanagementrestapp.model.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ConsumeCollege {

	private Integer collegeId; 
	private String collegeName;
	private String address;
	private List<Student> students = new ArrayList<Student>();

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public ConsumeCollege() {
		
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address
				+ ", students=" + students + "]";
	}
	
	
}
