package it.pippe.service;

import it.pippe.dao.IGenDAO;
import it.pippe.model.AttivitaDto;

public interface AttivitaService extends IGenDAO<AttivitaDto, Long>{
	
	public AttivitaDto getAttivitaById(long id);


}
