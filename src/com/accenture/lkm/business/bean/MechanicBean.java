package com.accenture.lkm.business.bean;

public class MechanicBean {
	private int mechanicId;
	private String mechanicType;
	private int numberOfVehicles;

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getMechanicType() {
		return mechanicType;
	}

	public void setMechanicType(String mechanicType) {
		this.mechanicType = mechanicType;
	}

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public MechanicBean(int mechanicId, String mechanicType, int numberOfVehicles) {
		super();
		this.mechanicId = mechanicId;
		this.mechanicType = mechanicType;
		this.numberOfVehicles = numberOfVehicles;
	}

	public MechanicBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MechanicBean [mechanicId=" + mechanicId + ", mechanicType=" + mechanicType + ", numberOfVehicles="
				+ numberOfVehicles + "]";
	}

}
