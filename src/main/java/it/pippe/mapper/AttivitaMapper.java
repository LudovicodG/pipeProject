package it.pippe.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import it.pippe.entity.Attivita;
import it.pippe.model.AttivitaDto;
@Mapper
public interface AttivitaMapper {

	AttivitaMapper INSTANCE = Mappers.getMapper(AttivitaMapper.class);

	@Mapping(source = "dipendenti", target = "listD")
	AttivitaDto toDto(Attivita attivita);


	@Mapping(source = "listD", target = "dipendenti")
	Attivita toEntity(AttivitaDto attivitaDto);

}
