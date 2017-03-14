/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao;

import com.javarevolutions.jhs.persistence.Alumnos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
/**
 *
 * @author martsa07
 */
public class ImplAlumno extends HibernateDaoSupport implements IfaceAlumno {

    @Override
    public void insert(Alumnos obj) {
        getHibernateTemplate().save(obj);
    }

    @Override
    public void delete(Alumnos obj) {
        getHibernateTemplate().delete(obj);
    }

    @Override
    public void update(Alumnos obj) {
        getHibernateTemplate().merge(obj);
    }

    @Override
    public List<Alumnos> getAll() {
        List<Alumnos> list = (List<Alumnos>)(Object)getHibernateTemplate().find("from Alumnos");
        return list;
    }
    
}
