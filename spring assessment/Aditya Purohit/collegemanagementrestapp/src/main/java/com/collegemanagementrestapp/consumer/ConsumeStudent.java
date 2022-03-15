package com.collegemanagementrestapp.consumer;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.collegemanagementrestapp.model.College;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ConsumeStudent {

	private Integer studentId;
	private String studentName;
	private College college;

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

	public ConsumeStudent() {
		
	}  
	
	
	
	
}
