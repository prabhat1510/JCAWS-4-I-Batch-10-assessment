package com.springassessment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Student_info")
public class Student {
	
	@Id
	private Integer studentId;
	@Column
	private String studentName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="college_Id",referencedColumnName="collegeId")
	@JsonIgnoreProperties("students")
	private College college;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String studentName, College collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
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
