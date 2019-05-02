package com.example.MiniAPI.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;


public interface GenericDAO<T , ID extends Serializable> {

    public void cleanSession();

    public Session getSession();
    public Session getSession( String key );

    public SessionFactory getTenantSessionFactory();
    
    
    

    public List<T> findAll();
    
    

}
