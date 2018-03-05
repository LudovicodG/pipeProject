package it.pippe.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import it.pippe.entity.Dipendente;
import it.pippe.model.DipendenteDto;


@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface DipendenteMapper {
	DipendenteMapper INSTANCE = Mappers.getMapper(DipendenteMapper.class);

	@Mapping(source = "attivita", target = "listA")
	DipendenteDto toDto(Dipendente dipendente);



	@Mapping(source = "listA", target = "attivita")
	Dipendente toEntity(DipendenteDto dipendenteDto);



}
