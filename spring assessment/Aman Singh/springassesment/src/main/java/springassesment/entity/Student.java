package springassesment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {

	@Id
	@GeneratedValue
	@Column
	private Integer studentId;
	private String studentName;
	@ManyToOne
	private Integer collegeId;
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
	
	public Student(Integer studentId, String studentName, Integer collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeId = collegeId;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeId=" + collegeId + "]";
	}
	


	
}