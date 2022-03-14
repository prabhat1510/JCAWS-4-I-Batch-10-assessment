package com.springassessmentclient.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
	private Integer studentId; 
	private String studentName;
	private Integer collegeId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "collageId")
	private Collage collage;
	public Student() {
	}
	public Integer getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public Collage getCollage() {
		return collage;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public void setCollage(Collage collage) {
		this.collage = collage;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeId=" + collegeId
				+ ", collage=" + collage + "]";
	}
}
