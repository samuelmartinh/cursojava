package com.javarevolutions.jhs.persistence;
// Generated Mar 14, 2017 9:05:29 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private String usuario;
     private String password;
     private String nombre;
     private Integer edad;
     private Set alumnoses = new HashSet(0);

    public Login() {
    }

	
    public Login(String usuario) {
        this.usuario = usuario;
    }
    public Login(String usuario, String password, String nombre, Integer edad, Set alumnoses) {
       this.usuario = usuario;
       this.password = password;
       this.nombre = nombre;
       this.edad = edad;
       this.alumnoses = alumnoses;
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
    public Set getAlumnoses() {
        return this.alumnoses;
    }
    
    public void setAlumnoses(Set alumnoses) {
        this.alumnoses = alumnoses;
    }




}


