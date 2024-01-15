package com.office.crud.pojo;

public class State {
	private short stateId;
	private String stateName;
	private Country country;
	public short getStateId() {
		return stateId;
	}
	public void setStateId(short stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", country=" + country + "]";
	}

	
}
