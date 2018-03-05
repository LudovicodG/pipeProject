package it.pippe.impldao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import it.pippe.dao.DipendenteDAO;
import it.pippe.dao.GenDAOImpl;
import it.pippe.entity.Dipendente;
import it.pippe.utils.HibernateUtil;

@Repository("dipendenteDao")
public class DipendenteDAOImpl extends GenDAOImpl<Dipendente, Long> implements DipendenteDAO {

	private static final Logger logger = Logger.getLogger(Dipendente.class);

	public Dipendente getDipendenteById(long id) {
		Dipendente dipendente = new Dipendente();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			dipendente = (Dipendente) session.get(Dipendente.class, id);
			return dipendente;
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
			return null;
		} finally {
			session.close();
		}
	}

}
