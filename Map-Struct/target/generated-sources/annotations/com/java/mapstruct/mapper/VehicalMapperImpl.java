package com.java.mapstruct.mapper;

import com.java.mapstruct.dto.VehicalDTO;
import com.java.mapstruct.entity.Vehicals;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-20T15:39:37+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class VehicalMapperImpl implements VehicalMapper {

    @Override
    public VehicalDTO toVehicalDTO(Vehicals vehical) {
        if ( vehical == null ) {
            return null;
        }

        VehicalDTO vehicalDTO = new VehicalDTO();

        vehicalDTO.setVehicalId( vehical.getVehicalId() );
        vehicalDTO.setVehicalModel( vehical.getVehicalModel() );
        vehicalDTO.setFuelCapacity( vehical.getFuelCapacity() );

        return vehicalDTO;
    }
}
