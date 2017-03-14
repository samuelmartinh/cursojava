/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bo;

import com.javarevolutions.jsf.bean.BeanAlumno;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author martsa07
 */
public interface AlumnoBO {
    void insert(BeanAlumno obj);
    void delete(BeanAlumno obj);
    void update(BeanAlumno obj);
    List<BeanAlumno> getAll();
}
