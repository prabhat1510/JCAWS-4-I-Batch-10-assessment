package com.springassesment.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Collage {
	@Id
	private Integer collageId;
	@Column
	private String collageName;
	@Column
	private String address;
	public Collage() {
	}
	public Integer getCollageId() {
		return collageId;
	}
	public void setCollageId(Integer collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", address=" + address + "]";
	}
	
	
	
	
	
}
