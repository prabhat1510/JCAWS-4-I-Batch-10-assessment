package com.collegeinfoapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue
	private Integer collegeId; 
	private String collegeName; 
	private String address;
	
	@OneToMany(targetEntity = Student.class, mappedBy = "college") 
    private List<Student> students;
	
	public College() {
		// TODO Auto-generated constructor stub
	}
	
	public College(Integer collegeId, String collegeName, String address, List<Student> students) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
		this.students = students;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address
				+ ", students=" + students + "]";
	}
	 
	
	


}
