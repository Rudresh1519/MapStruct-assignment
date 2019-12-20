package com.java.mapstruct.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Locations {

	@Id
	int locationId;
	//@Column(unique=true)
	String locationName;
	String address;
	
	 @OneToMany
	 private List<Vehicals> vehicalList;
	
	
	public List <Vehicals> getVehicalList() {
        return vehicalList;
    }

    public void setVehicalList(List<Vehicals> vehicalList) {
        this.vehicalList = vehicalList;
    }
	
	public Locations()
	{
		
	}
	
	public Locations(int locationId, String locationName, String address, List<Vehicals> vehicalList) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.address = address;
		this.vehicalList = vehicalList;
	}

	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
