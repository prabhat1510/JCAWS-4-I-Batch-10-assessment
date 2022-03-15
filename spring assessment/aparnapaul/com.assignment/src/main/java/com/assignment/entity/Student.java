package com.assignment.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Student {
	private Integer studentId;
	private String studentName ;
	private Integer collegeId; 
	
	@JoinColumn(name = "collegeId")
	@ManyToOne(cascade = CascadeType.ALL)//Owning side
	private College college;

	

	public Student(Integer studentId, String studentName, Integer collegeId, College college) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeId = collegeId;
		this.college = college;
	}

	public Student() {
		
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	}

	
	
	
}


//https://github.com/prabhat1510/JCAWS-4-I-Batch-10-assessment.git
