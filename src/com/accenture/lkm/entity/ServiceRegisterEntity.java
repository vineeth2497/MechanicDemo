package com.accenture.lkm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ServiceRegister")
public class ServiceRegisterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
	private String vehicleNo;
	private String vehicleType;
	private int mechanicId;

	public ServiceRegisterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceRegisterEntity(int serviceId, String vehicleNo, String vehicleType, int mechanicId) {
		super();
		this.serviceId = serviceId;
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.mechanicId = mechanicId;
	}

	@Override
	public String toString() {
		return "ServiceRegisterEntity [serviceId=" + serviceId + ", vehicleNo=" + vehicleNo + ", vehicleType="
				+ vehicleType + ", mechanicId=" + mechanicId + "]";
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

}
