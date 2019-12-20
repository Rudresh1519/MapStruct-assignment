package com.java.mapstruct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.mapstruct.dto.LocationVehicalDto;
import com.java.mapstruct.dto.VehicalDTO;
import com.java.mapstruct.dto.VehicalLocationDto;
import com.java.mapstruct.entity.Locations;
import com.java.mapstruct.entity.Vehicals;
import com.java.mapstruct.service.VehicalLocationService;

@RestController
@RequestMapping("/vehical")
public  class VehicalLocationController{

	@Autowired
	private VehicalLocationService vehicallocationservice;

	//ModelMapper modelMapper = new ModelMapper();
		
	//private Vehicals vehicals;
	
	//@Autowired
	//private List<VehicalDto> vehicalDto = Arrays.asList(modelMapper.map(vehicals , VehicalDto[].class));
	
	@RequestMapping(method = RequestMethod.POST , value = "/")
	public VehicalDTO addVehical(@RequestBody Vehicals vehical)
	{
		return vehicallocationservice.addVehical(vehical);
	
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/vehicallocationdto")
	public VehicalLocationDto addVehicalLocation(@RequestBody Vehicals vehical)
	{
		return vehicallocationservice.addVehicalLocation(vehical);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/locationvehicaldto")
	public LocationVehicalDto addLocationVehical(@RequestBody Locations location)
	{
		return vehicallocationservice.addLocationVehical(location);
	}
	
	
	/*@RequestMapping("/")
	public List<Vehicals> getAllVehical()
	{
		return vehicallocationservice.getAllVehical();
	}
	
	@RequestMapping("/{vehicalId}")
	public Optional<Vehicals> getVehical(@PathVariable int vehicalId)
	{
		return vehicallocationservice.getVehical(vehicalId);
	}*/
	
	/*@RequestMapping("/")
	public VehicalDTO getAllVehical()
	{
		return vehicallocationservice.getAllVehical();
	}*/
	
	
	/*	@RequestMapping(method = RequestMethod.PUT ,value = "/{vehicalId}")
	public void updateVehical(@RequestBody Vehicals vehical,@PathVariable int vehicalId)
	{
		vehicallocationservice.updateVehical(vehicalId, vehical);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value = "/{vehicalId}")
	public void deleteVehical(@PathVariable int vehicalId)
	{
		vehicallocationservice.deleteVehical(vehicalId);
	}
	
	@RequestMapping("/Location")
	public List<Locations> getAllLocation()
	{
		return vehicallocationservice.getAllLocation();
	}
	
	@RequestMapping("/Location/{locationId}")
	public Optional<Locations> getLocation(int locationId)
	{
		return vehicallocationservice.getLocation(locationId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Location")
	public void addLocation(@RequestBody Locations location)
	{ 
		vehicallocationservice.addLocation(location);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/Location/locationId")
	public void updateLocation(@RequestBody Locations location, int locationId)
	{
		vehicallocationservice.updateLocation(locationId, location);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/Location/locationId")
	public void deleteLocation(int locationId)
	{
		vehicallocationservice.deleteLocation(locationId);
	}*/
	
}
