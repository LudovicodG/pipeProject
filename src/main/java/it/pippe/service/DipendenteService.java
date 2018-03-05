package it.pippe.service;

import it.pippe.dao.IGenDAO;
import it.pippe.model.DipendenteDto;

public interface DipendenteService extends IGenDAO<DipendenteDto, Long>{
	
	public DipendenteDto getDipendenteById(long id);
	

}
