package com.java.mapstruct.dto;

public class VehicalDTO {

	int vehicalId;
	String VehicalModel;
	int fuelCapacity;
	
	public VehicalDTO(int vehicalId, String vehicalModel, int fuelCapacity) {
		super();
		this.vehicalId = vehicalId;
		VehicalModel = vehicalModel;
		this.fuelCapacity = fuelCapacity;
	}
	
	public VehicalDTO() {
	
	}
	
	public int getVehicalId() {
		return vehicalId;
	}
	
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	
	public String getVehicalModel() {
		return VehicalModel;
	}
	
	public void setVehicalModel(String vehicalModel) {
		VehicalModel = vehicalModel;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	
	
	
	
}
