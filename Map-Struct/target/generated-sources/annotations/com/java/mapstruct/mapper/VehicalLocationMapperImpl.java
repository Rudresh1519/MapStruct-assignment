package com.java.mapstruct.mapper;

import com.java.mapstruct.dto.VehicalLocationDto;
import com.java.mapstruct.entity.Locations;
import com.java.mapstruct.entity.Vehicals;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-20T15:39:37+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class VehicalLocationMapperImpl implements VehicalLocationMapper {

    @Override
    public VehicalLocationDto toVehicalLocationDto(Vehicals vehicals) {
        if ( vehicals == null ) {
            return null;
        }

        VehicalLocationDto vehicalLocationDto = new VehicalLocationDto();

        vehicalLocationDto.setLocationId( vehicalsLocationsLocationId( vehicals ) );
        vehicalLocationDto.setLocationName( vehicalsLocationsLocationName( vehicals ) );
        vehicalLocationDto.setVehicalId( vehicals.getVehicalId() );
        vehicalLocationDto.setVehicalModel( vehicals.getVehicalModel() );

        return vehicalLocationDto;
    }

    private int vehicalsLocationsLocationId(Vehicals vehicals) {
        if ( vehicals == null ) {
            return 0;
        }
        Locations locations = vehicals.getLocations();
        if ( locations == null ) {
            return 0;
        }
        int locationId = locations.getLocationId();
        return locationId;
    }

    private String vehicalsLocationsLocationName(Vehicals vehicals) {
        if ( vehicals == null ) {
            return null;
        }
        Locations locations = vehicals.getLocations();
        if ( locations == null ) {
            return null;
        }
        String locationName = locations.getLocationName();
        if ( locationName == null ) {
            return null;
        }
        return locationName;
    }
}
