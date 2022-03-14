package com.assessmentSpring.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college_info")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer collegeId;
	private String collegeName;
	private String address;

	public College() {
	}

	public College(String collegeName, String address) {
		super();
		this.collegeName = collegeName;
		this.address = address;
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

	@Override
	public int hashCode() {
		return Objects.hash(address, collegeId, collegeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		return Objects.equals(address, other.address) && Objects.equals(collegeId, other.collegeId)
				&& Objects.equals(collegeName, other.collegeName);
	}

}
