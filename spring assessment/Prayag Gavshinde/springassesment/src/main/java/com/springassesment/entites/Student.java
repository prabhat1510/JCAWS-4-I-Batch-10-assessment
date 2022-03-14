package com.springassesment.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	private Integer studentId;
	@Column
	private String studentName;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "collageId",referencedColumnName="collageId")
	private Collage collageId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String studentName, Collage collageId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collageId = collageId;
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
	public Collage getCollageId() {
		return collageId;
	}
	public void setCollageId(Collage collageId) {
		this.collageId = collageId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collageId=" + collageId + "]";
	}
	
	

}
