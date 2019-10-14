package com.accenture.lkm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mechanic")
public class MechanicEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mechanicId;
	private String mechanicType;
	private int numberOfvehicles;

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

	public int getNumberOfvehicles() {
		return numberOfvehicles;
	}

	public void setNumberOfvehicles(int numberOfvehicles) {
		this.numberOfvehicles = numberOfvehicles;
	}

	@Override
	public String toString() {
		return "MechanicEntity [mechanicId=" + mechanicId + ", mechanicType=" + mechanicType + ", numberOfvehicles="
				+ numberOfvehicles + "]";
	}

	public MechanicEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MechanicEntity(int mechanicId, String mechanicType, int numberOfvehicles) {
		super();
		this.mechanicId = mechanicId;
		this.mechanicType = mechanicType;
		this.numberOfvehicles = numberOfvehicles;
	}

}
