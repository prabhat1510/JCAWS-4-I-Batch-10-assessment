package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue
	private Integer collegeId;
	private String collegeName;
	private String address;

	public College(Integer collegeId, String collegeName, String address) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}

}
