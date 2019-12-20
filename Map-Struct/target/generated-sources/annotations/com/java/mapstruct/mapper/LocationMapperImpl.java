package com.java.mapstruct.mapper;

import com.java.mapstruct.dto.LocationVehicalDto;
import com.java.mapstruct.dto.VehicalDTO;
import com.java.mapstruct.entity.Locations;
import com.java.mapstruct.entity.Vehicals;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-20T15:39:37+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public LocationVehicalDto toLocationVehicalDto(Locations locations) {
        if ( locations == null ) {
            return null;
        }

        LocationVehicalDto locationVehicalDto = new LocationVehicalDto();

        locationVehicalDto.setVehicalDtoList( vehicalsListToVehicalDTOList( locations.getVehicalList() ) );
        locationVehicalDto.setLocationId( locations.getLocationId() );
        locationVehicalDto.setLocationName( locations.getLocationName() );
        locationVehicalDto.setAddress( locations.getAddress() );

        return locationVehicalDto;
    }

    protected VehicalDTO vehicalsToVehicalDTO(Vehicals vehicals) {
        if ( vehicals == null ) {
            return null;
        }

        VehicalDTO vehicalDTO = new VehicalDTO();

        vehicalDTO.setVehicalId( vehicals.getVehicalId() );
        vehicalDTO.setVehicalModel( vehicals.getVehicalModel() );
        vehicalDTO.setFuelCapacity( vehicals.getFuelCapacity() );

        return vehicalDTO;
    }

    protected List<VehicalDTO> vehicalsListToVehicalDTOList(List<Vehicals> list) {
        if ( list == null ) {
            return null;
        }

        List<VehicalDTO> list1 = new ArrayList<VehicalDTO>( list.size() );
        for ( Vehicals vehicals : list ) {
            list1.add( vehicalsToVehicalDTO( vehicals ) );
        }

        return list1;
    }
}
