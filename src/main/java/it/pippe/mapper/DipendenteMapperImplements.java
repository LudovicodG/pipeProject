package it.pippe.mapper;

import java.util.ArrayList;
import java.util.List;

import it.pippe.entity.Dipendente;
import it.pippe.model.DipendenteDto;

public class DipendenteMapperImplements{



	public List<DipendenteDto> toDto(List<Dipendente> dipendente) {

		List<DipendenteDto> listD=new ArrayList<DipendenteDto>();
		DipendenteDto dip;

		if(dipendente != null) {

			for(int i=0; i<dipendente.size();i++) {

				dip=DipendenteMapper.INSTANCE.toDto(dipendente.get(i));
				listD.add(dip);

			}
		}

		return listD;
	}



	public List<Dipendente> toEntity(List<DipendenteDto> dipendenteDto) {

		List<Dipendente> listD=new ArrayList<Dipendente>();
		Dipendente dip;

		if(dipendenteDto != null) {

			for(int i=0; i<dipendenteDto.size();i++) {

				dip=DipendenteMapper.INSTANCE.toEntity(dipendenteDto.get(i));
				listD.add(dip);

			}
		}

		return listD;
	}

}
