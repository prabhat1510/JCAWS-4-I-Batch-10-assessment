package com.collegemanagementrestapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Student {

	@Id
	@Column(name = "student_Id")
	private Integer studentId;
	
	@Column(name = "student_Name")
	private String studentName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="college_Id",referencedColumnName="collegeId")
	@JsonIgnoreProperties("students")
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

	public Student() {
		
	}  
	
	

}
