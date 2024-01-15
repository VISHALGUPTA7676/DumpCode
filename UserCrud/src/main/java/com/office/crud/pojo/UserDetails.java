package com.office.crud.pojo;

public class UserDetails {
	private int userDetailIs;
	private String firstName;
	private String lastName;
	private String mobileNuber;
	private String cityName;
	private State state;
	public int getUserDetailIs() {
		return userDetailIs;
	}
	public void setUserDetailIs(int userDetailIs) {
		this.userDetailIs = userDetailIs;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNuber() {
		return mobileNuber;
	}
	public void setMobileNuber(String mobileNuber) {
		this.mobileNuber = mobileNuber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "UserDetails [userDetailIs=" + userDetailIs + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNuber=" + mobileNuber + ", cityName=" + cityName + ", state=" + state + "]";
	}
	

}
