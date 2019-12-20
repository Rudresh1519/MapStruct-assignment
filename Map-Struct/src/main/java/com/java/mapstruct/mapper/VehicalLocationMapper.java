package com.java.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.java.mapstruct.dto.VehicalLocationDto;
import com.java.mapstruct.entity.Locations;
import com.java.mapstruct.entity.Vehicals;

@Mapper(componentModel = "spring")
public interface VehicalLocationMapper {

	//@Mapping(target="locationId", expression = "java(locations.getlocationId())")
	//@Mapping(target="locationName", expression = "java(locations.getlocationName())")
	
	@Mapping(target="locationId", source = "locations.locationId")
	@Mapping(target="locationName", source = "locations.locationName")
	VehicalLocationDto toVehicalLocationDto(Vehicals vehicals);
	
}
