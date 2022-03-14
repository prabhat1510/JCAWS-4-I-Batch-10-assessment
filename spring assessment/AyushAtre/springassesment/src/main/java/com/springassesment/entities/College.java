package com.springassesment.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer collegeId;
	
	@Column(name="college_name")
	private String collegeName;
	
	@Column(name = "address")
	private String address;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "college",cascade = CascadeType.ALL)
	private List<Student> students;

	public College() {}

	public College(String collegeName, String address) {
		this.collegeName = collegeName;
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
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

	public Integer getCollegeId() {
		return collegeId;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}

}
