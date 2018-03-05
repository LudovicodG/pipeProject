package it.pippe.dao;

 

import java.io.Serializable;
import java.util.List;
 

 

public interface IGenDAO<E, K extends Serializable> {
    public void saveOrUpdate(E entity); 
    public List<E> getAll();
    public E get(K id);
    public void remove(E entity);
    public void remove (K id);
}