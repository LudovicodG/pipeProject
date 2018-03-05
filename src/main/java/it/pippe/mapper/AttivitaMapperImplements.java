package it.pippe.mapper;

import java.util.ArrayList;
import java.util.List;

import it.pippe.entity.Attivita;
import it.pippe.model.AttivitaDto;


public class AttivitaMapperImplements {
	
	public List<AttivitaDto> toDto(List<Attivita> attivita) {

		List<AttivitaDto> listA=new ArrayList<AttivitaDto>();
		AttivitaDto att;

		if(attivita != null) {

			for(int i=0; i<attivita.size();i++) {

				att=AttivitaMapper.INSTANCE.toDto(attivita.get(i));
				listA.add(att);

			}
		}

		return listA;
	}



	public List<Attivita> toEntity(List<AttivitaDto> attivitaDto) {

		List<Attivita> listA=new ArrayList<Attivita>();
		Attivita att;

		if(attivitaDto != null) {

			for(int i=0; i<attivitaDto.size();i++) {

				att=AttivitaMapper.INSTANCE.toEntity(attivitaDto.get(i));
				listA.add(att);

			}
		}

		return listA;
	}


}
