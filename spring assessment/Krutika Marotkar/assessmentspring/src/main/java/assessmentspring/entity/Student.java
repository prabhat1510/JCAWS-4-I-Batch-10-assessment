package assessmentspring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Integer studentId ;
	private String studentName ;
	//foreign key
   // @ManyToOne
	private Integer collegeId ;
	
	public Student() {
		super();
	}
	public Student(Integer studentId, String studentName, Integer collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeId = collegeId;
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeId=" + collegeId + "]";
	}
	
	



}
