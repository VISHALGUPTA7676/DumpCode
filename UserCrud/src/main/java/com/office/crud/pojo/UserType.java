package com.office.crud.pojo;

public class UserType {

	private byte userTypeId;
	private String userType;
	public byte getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(byte userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserType [userTypeId=" + userTypeId + ", userType=" + userType + "]";
	}
	
}
