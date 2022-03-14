package com.assignment.entity;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college_info")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer collegeId; 
	private String collegeName ;
	private String address ;
	
	
	@OneToMany(mappedBy = "student") //inverse side
	private Set<Student> students;
	
	public College() {
		
	}

	public College(Integer collegeId, String collegeName, String address) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
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

	public Set<Student> getStudents() {
		return students;
	}
	
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}
	
}

