package com.java.mapstruct.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.java.mapstruct.dto.LocationVehicalDto;
import com.java.mapstruct.dto.VehicalDTO;
import com.java.mapstruct.dto.VehicalLocationDto;
import com.java.mapstruct.entity.Locations;
import com.java.mapstruct.entity.Vehicals;
import com.java.mapstruct.mapper.LocationMapper;
import com.java.mapstruct.mapper.VehicalLocationMapper;
import com.java.mapstruct.mapper.VehicalMapper;
import com.java.mapstruct.repository.LocationsRepository;
import com.java.mapstruct.repository.VehicalsRepository;


@Service
public class VehicalLocationService {

	@Autowired
	VehicalsRepository vehicalrepository;
	@Autowired
	LocationsRepository locationrepository;

	@Autowired
	private VehicalMapper vehicalMapper;
	
	@Autowired
	private VehicalLocationMapper vehicalLocationMapper;
	
	@Autowired
	private LocationMapper locationMapper;
	
	public VehicalDTO addVehical(Vehicals vehical) {

        //		vehicalrepository.save(vehical);
	
		return vehicalMapper.toVehicalDTO(vehical);
	}
	
	public VehicalLocationDto addVehicalLocation(Vehicals vehical)
	{
		return vehicalLocationMapper.toVehicalLocationDto(vehical);
	}
	
	public LocationVehicalDto addLocationVehical(Locations location)
	{
		return locationMapper.toLocationVehicalDto(location);
	}
	
	
	/*public List<Vehicals> getAllVehical() {

		return (List<Vehicals>) vehicalrepository.findAll();
	}

	public Optional<Vehicals> getVehical(int vehicalId) {

		return vehicalrepository.findById(vehicalId);
	}*/

	

/*	public void updateVehical(int vehicalId, Vehicals vehical) {

		vehicalrepository.save(vehical);
	}

	public void deleteVehical(int vehicalId) {

		vehicalrepository.deleteById(vehicalId);
	}*/


/*	 public List<Locations> getAllLocation() {
	  
	  return (List<Locations>) locationrepository.findAll(); }
	 
	  public Optional<Locations> getLocation(int locationId) {
	  
	  return locationrepository.findById(locationId); }
	 
	  public void addLocation(Locations location) {
	  
	  locationrepository.save(location); }
	  
	  public void updateLocation(int locationId, Locations location) {
	  
	  locationrepository.save(location); }
	  
	  public void deleteLocation(int locationId) {
	  
	  locationrepository.deleteById(locationId);
	 
	  }*/
	    
	 

}
