package com.javarevolutions.jdbc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarevolutions.jdbc.bean.BeanLogin;
import com.javarevolutions.jdbc.dao.IfaceLogin;
import com.javarevolutions.jdbc.dao.ImplLogin;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		BeanLogin bean = new BeanLogin();
		bean.setUsuario(usuario);
		bean.setPassword(password);
		IfaceLogin Iface = new ImplLogin();
		bean = Iface.validaLogin(bean);
		if(bean != null){
			System.out.println("welcome :" + bean.getNombre());
			System.out.println("Tu tienes :" + bean.getEdad() + " años");
			response.sendRedirect("welcome/welcome.jsp?usuarioLogueado=" + bean.getUsuario() + "&aniosUsuarioLogueado=" + bean.getEdad());
		}else{
			System.out.println("Usuario o contraseña no validos!");
			response.sendRedirect("login.html");
		}
	}
}
