package com.example.act2.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.act2.DTO.CochesDTO;
import com.example.act2.Model.Coches;

@Mapper(componentModel = "spring")
public interface CochesMapper {

    CochesDTO toCochesDTO(Coches coches);

    @Mapping(target = "id", ignore = true)
    Coches toCoches(CochesDTO cochesDTO);

}
