/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bo;

import com.javarevolutions.jdbc.dao.ImplAlumno;
import com.javarevolutions.jhs.persistence.Alumnos;
import com.javarevolutions.jhs.persistence.Login;
import com.javarevolutions.jsf.bean.BeanAlumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martsa07
 */
public class AlumnoImplBO implements AlumnoBO {

    private ImplAlumno alumnoDAO;

    @Override
    public void insert(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumnoDAO.insert(alumno);
    }

    @Override
    public void delete(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumnoDAO.delete(alumno);
    }

    @Override
    public void update(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumnoDAO.update(alumno);
    }

    @Override
    public List<BeanAlumno> getAll() {
        List<BeanAlumno> lista = new ArrayList<BeanAlumno>();
        for (Alumnos obj : alumnoDAO.getAll()) {
            BeanAlumno bean = new BeanAlumno();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setEdad(obj.getEdad());
            bean.setSexo(obj.getSexo());
            bean.setUsuario(obj.getLogin().getUsuario());
            lista.add(bean);
        }

        return lista;
    }

    /**
     * @return the alumnoDAO
     */
    public ImplAlumno getAlumnoDAO() {
        return alumnoDAO;
    }

    /**
     * @param alumnoDAO the alumnoDAO to set
     */
    public void setAlumnoDAO(ImplAlumno alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
    }
}
