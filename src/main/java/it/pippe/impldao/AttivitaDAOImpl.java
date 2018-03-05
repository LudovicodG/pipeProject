package it.pippe.impldao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import it.pippe.dao.AttivitaDAO;
import it.pippe.dao.GenDAOImpl;
import it.pippe.entity.Attivita;
import it.pippe.entity.Dipendente;
import it.pippe.utils.HibernateUtil;

@Repository("attivitaDao")
public class AttivitaDAOImpl extends GenDAOImpl<Attivita, Long> implements AttivitaDAO{
	
	private static final Logger logger = Logger.getLogger(Dipendente.class);

	public Attivita getAttivitaById(long id) {
		Attivita attivita = new Attivita();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			attivita = (Attivita) session.get(Attivita.class, id);
			return attivita;
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
			return null;
		} finally {
			session.close();
		}
	}

}
