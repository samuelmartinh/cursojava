package com.javarevolutions.jdbc.dao;

import com.javarevolutions.jhs.persistence.Login;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class ImplLogin extends HibernateDaoSupport implements IfaceLogin {

    @Override
    public Login validaLogin(Login obj) {
        List<Object> list = getHibernateTemplate().find("from Login where usuario = ? and password = ?",obj.getUsuario(), obj.getPassword());
        if (list.size() > 0) {
            return (Login)list.get(0);
        }
        return null;
    }
}
