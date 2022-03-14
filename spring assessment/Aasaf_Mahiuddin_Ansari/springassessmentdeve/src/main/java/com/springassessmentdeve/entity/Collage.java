package com.springassessmentdeve.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {
	@Id
	private Integer collegeId;
	private String collegeName; 
	private String address;
	@OneToMany(mappedBy = "collage")
	private Set<Student> student;
	public Collage() {
	}
	
	public Integer getCollegeId() {
		return collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getAddress() {
		return address;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Collage [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}
	

}
