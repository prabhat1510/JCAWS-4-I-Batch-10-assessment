package com.assessmentspringrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;**/

@Entity
@Table(name = "student_info")
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	/**@OneToOne
    @JoinColumn(name = "collegeId")
    @RestResource(path = "libraryAddress", rel="address")
	private College college;**/
	
	public Student() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	public Student(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	

}