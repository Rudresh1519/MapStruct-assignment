package com.java.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.java.mapstruct.dto.VehicalDTO;
import com.java.mapstruct.entity.Vehicals;

@Mapper(componentModel = "spring")
public interface VehicalMapper {

	VehicalDTO toVehicalDTO(Vehicals vehical);

}
