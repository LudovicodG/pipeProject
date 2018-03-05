package it.pippe.dao;

import it.pippe.entity.Dipendente;

public interface DipendenteDAO extends IGenDAO<Dipendente, Long>{
	
	public Dipendente getDipendenteById(long id);
}
	