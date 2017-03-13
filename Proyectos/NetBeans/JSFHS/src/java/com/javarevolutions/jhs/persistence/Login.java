package com.javarevolutions.jhs.persistence;
// Generated Mar 13, 2017 10:08:37 AM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private String usuario;
     private String password;
     private String nombre;
     private Integer edad;

    public Login() {
    }

	
    public Login(String usuario) {
        this.usuario = usuario;
    }
    public Login(String usuario, String password, String nombre, Integer edad) {
       this.usuario = usuario;
       this.password = password;
       this.nombre = nombre;
       this.edad = edad;
    }
   
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }




}

