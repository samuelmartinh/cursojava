/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bean;

import com.javarevolutions.jsf.bo.AlumnoImplBO;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author martsa07
 */
public class BeanAlumno {

    
    private Integer matricula;
    private String usuario;
    private String nombre;
    private String app;
    private String apm;
    private Integer edad;
    private String sexo;
    private AlumnoImplBO alumnoBO;
    private List<BeanAlumno> lista;
    
    public BeanAlumno(){
    }
    
    /**
     * @return the matricula
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the app
     */
    public String getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * @return the apm
     */
    public String getApm() {
        return apm;
    }

    /**
     * @param apm the apm to set
     */
    public void setApm(String apm) {
        this.apm = apm;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
     * @return the alumnoBO
     */
    public AlumnoImplBO getAlumnoBO() {
        return alumnoBO;
    }

    /**
     * @param alumnoBO the alumnoBO to set
     */
    public void setAlumnoBO(AlumnoImplBO alumnoBO) {
        this.alumnoBO = alumnoBO;
    }
    
    /**
     * @return the lista
     */
    public List<BeanAlumno> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<BeanAlumno> lista) {
        this.lista = lista;
    }
    
    public String insert(){
        alumnoBO.insert(this);
        getAll();
        return "";
    }
    
    public String delete(){
        alumnoBO.delete(this);
        getAll();
        return "";
    }
    
    public String update(){
        alumnoBO.update(this);
        getAll();
        return "";
    }
     
    @PostConstruct
    public void getAll(){
        setLista(alumnoBO.getAll());
    }
}
