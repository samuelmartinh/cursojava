package com.javarevolutions.curso1.vo;

import java.io.Serializable;

//VO value object o Java Bean
public class VOCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1192074921810250481L;
	
	private Integer Id;
	private String nombre;
	private String app;
	private Integer edad;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
