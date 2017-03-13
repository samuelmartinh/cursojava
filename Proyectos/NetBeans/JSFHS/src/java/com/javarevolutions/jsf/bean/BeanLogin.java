package com.javarevolutions.jsf.bean;

import com.javarevolutions.jsf.bo.LoginImplBO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

//@ManagedBean(name = "loginBean")
public class BeanLogin {

    private String mensaje;
    private Boolean status;
    private String usuario;
    private String password;
    private String nombre;
    private Integer edad;
    private List<BeanLogin> listaUsuarios;
    private LoginImplBO loginBO;
    
    public List<BeanLogin> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<BeanLogin> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String validarLogin() {
        System.out.println("User : " + getUsuario());
        System.out.println("Password : " + getPassword());
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
        if (this.getStatus()) {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<BeanLogin>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            return "alumnos/alumno";
        } else {
            return "login";
        }
    }

    /**
     * @return the loginBO
     */
    public LoginImplBO getLoginBO() {
        return loginBO;
    }

    /**
     * @param loginBO the loginBO to set
     */
    public void setLoginBO(LoginImplBO loginBO) {
        this.loginBO = loginBO;
    }

}
