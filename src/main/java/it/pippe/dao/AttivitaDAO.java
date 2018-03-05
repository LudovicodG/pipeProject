package it.pippe.dao;

import it.pippe.entity.Attivita;

public interface AttivitaDAO extends IGenDAO<Attivita, Long>{

	public Attivita getAttivitaById(long id);
}
