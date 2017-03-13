/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bo;

import com.javarevolutions.jdbc.dao.ImplLogin;
import com.javarevolutions.jhs.persistence.Login;
import com.javarevolutions.jsf.bean.BeanLogin;
import org.springframework.stereotype.Service;

/**
 *
 * @author martsa07
 */
public class LoginImplBO implements LoginBO{
    
    private ImplLogin loginDAO;
    
    @Override
    public void validaLogin(BeanLogin obj) {
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        if(login != null){
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        }else{
            obj.setStatus(false);
            obj.setMensaje("El usuario no existe");
        }
    }

    /**
     * @return the loginDAO
     */
    public ImplLogin getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ImplLogin loginDAO) {
        this.loginDAO = loginDAO;
    }
}
