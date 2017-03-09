package com.javarevolutions.jsf.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="loginBean")
public class BeanLogin {
	private String user;
	private String password;
	private String nombre;
	private Integer edad;
	private List<BeanLogin> listaAlumnos;
	
	public List<BeanLogin> getListaAlumnos() {
		return listaAlumnos;
	}
	public void setListaAlumnos(List<BeanLogin> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validarLogin(){
		System.out.println("User : " + getUser());
		System.out.println("Password : " + getPassword());
		if(getUser().equals("Samuel") && getPassword().equals("123pass")){
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			Map<String, Object> sessionMap = externalContext.getSessionMap();
			listaAlumnos = new ArrayList<BeanLogin>();
			sessionMap.put("listaAlumnos", listaAlumnos);
			return "alumnos/alumno";
		}
		else{
			return "login";
		}
	}
	
	public String guardar(){
		System.out.println("Guardando . . .");
		System.out.println("Usuario : " + getUser());
		System.out.println("Password : " + getPassword());
		setLista();
		listaAlumnos.add(this);
		return "";
	}
	
	public String actualizar(){
		System.out.println("Actualizando . . .");
		setLista();
		for(BeanLogin obj : listaAlumnos){
			if(obj.getUser().equals(getUser())){
				obj.setPassword(getPassword());
				obj.setEdad(getEdad());
				obj.setNombre(getNombre());
			}
		}
		return "";
	}
	
	public String borrar(){
		System.out.println("Borrando . . .");
		setLista();
		for(BeanLogin obj : listaAlumnos){
			if(obj.getUser().equals(getUser())){
				listaAlumnos.remove(obj);
				break;
			}
		}
		return "";
	}
	
	public void setLista(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		listaAlumnos = (List<BeanLogin>)sessionMap.get("listaAlumnos");
	}
}
