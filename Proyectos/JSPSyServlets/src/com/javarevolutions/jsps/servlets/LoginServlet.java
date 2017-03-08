package com.javarevolutions.jsps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javarevolutions.jsps.servlets.vo.VOLogin;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		System.out.println("usuario : " + usuario);
		System.out.println("password : " + password);
		
		
		
		if(usuario.equals("Samuel") && password.equals("123pass"))
		{
			VOLogin vo = new VOLogin();
			vo.setUsuario(usuario);
			vo.setPassword(password);
			vo.setEdad(30);
			vo.setNombre("Samuel Martin");
			
			System.out.println("Welcome . . .");
			
			HttpSession session = request.getSession(true);
			List<VOLogin> lista = new ArrayList<VOLogin>();
			
			session.setAttribute("usuarioLogueado",vo);
			session.setAttribute("listaUsuario",lista);
			
			//request.setAttribute("usuarioLogueado", vo);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else
		{
			System.out.println("Error en credenciales de acceso");
			response.sendRedirect("login.html");
		}
		
	}

}
