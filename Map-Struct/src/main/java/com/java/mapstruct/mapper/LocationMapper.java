package com.java.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.java.mapstruct.dto.LocationVehicalDto;
import com.java.mapstruct.entity.Locations;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	@Mapping(source = "vehicalList", target = "vehicalDtoList")
	LocationVehicalDto toLocationVehicalDto(Locations locations);
	
}
