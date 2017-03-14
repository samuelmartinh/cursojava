/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao;

import com.javarevolutions.jhs.persistence.Alumnos;
import java.util.List;

/**
 *
 * @author martsa07
 */
public interface IfaceAlumno {
    void insert(Alumnos obj);
    void delete(Alumnos obj);
    void update(Alumnos obj);
    List<Alumnos> getAll();
}
