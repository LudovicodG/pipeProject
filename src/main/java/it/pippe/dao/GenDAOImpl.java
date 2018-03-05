package it.pippe.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import it.pippe.utils.HibernateUtil;




public abstract class GenDAOImpl<E, K extends Serializable> implements IGenDAO<E, K> {

	@SuppressWarnings("unused")
	private IGenDAO<E, K> genericDao;

	protected Class<? extends E> daoType;

	private static final Logger logger = Logger.getLogger(GenDAOImpl.class);

	public GenDAOImpl(IGenDAO<E, K> genericDao) {
		this.genericDao = genericDao;

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenDAOImpl() {
		Type t = getClass().getGenericSuperclass();

		if (t instanceof ParameterizedType) {
			daoType = (Class<? extends E>) ((ParameterizedType) t).getActualTypeArguments()[0];
		} else if (t instanceof Class) {
			daoType = (Class<? extends E>) ((ParameterizedType) ((Class) t).getGenericSuperclass())
					.getActualTypeArguments()[0];

		} else {
			throw new RuntimeException("Can not handle type construction for '" + getClass() + "'!");
		}

		/*
		 * ParameterizedType pt = (ParameterizedType) t; daoType = (Class)
		 * pt.getActualTypeArguments()[0];
		 */
	}

	@Transactional
	public void saveOrUpdate(E entity) {

		Session session = HibernateUtil.currentSession();
		try {

			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(entity);
			tx.commit();
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
		} finally {
			HibernateUtil.closeSession();
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<E> getAll() {
		Session session = HibernateUtil.currentSession();
		List<E> out = null;
		try {
			out = session.createCriteria(daoType).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
		} finally {
			HibernateUtil.closeSession();
		}
		return out;
	}

	@Transactional
	public E get(K key) {
		Session session = HibernateUtil.currentSession();
		E out = null;
		try {
			out = (E) session.get(daoType, key);
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
		} finally {
			HibernateUtil.closeSession();
		}
		return out;
	}

	/**
	 * Aggiunge un nuovo record rappresentato nella tabella
	 */

	@Transactional
	public void remove(E entity) {
		Session session = HibernateUtil.currentSession();
		try {
			Transaction tx = session.beginTransaction();
			session.delete(entity);
			tx.commit();
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
		} finally {
			HibernateUtil.closeSession();
		}

	}

	// @Transactional(propagation = Propagation.REQUIRED)
	public void remove(K id) {
		E entity = this.get(id);
		Session session = HibernateUtil.currentSession();
		try {
			session.beginTransaction();
			session.delete(entity);
		} catch (Exception e) {
			logger.error("Impossibile eseguire il metodo DAO", e);
		} finally {
			HibernateUtil.closeSession();
		}
	}

}
