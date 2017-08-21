package com.everis.alicante.becajava.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletContadorAmbito extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		HttpSession sesion = req.getSession();
		ServletContext contexto = getServletContext();
		
		int conSesion = 0;
		int conAplicacion = 0;
		
		if (sesion.getAttribute("contadorUno") != null)
			conSesion = (Integer)sesion.getAttribute("contadorUno");
		
		if (contexto.getAttribute("contadorDos") != null)
			conAplicacion = (Integer)contexto.getAttribute("contadorDos");
		
		conSesion++;
		conAplicacion++;
		
		sesion.setAttribute("contadorUno", conSesion);
		contexto.setAttribute("contadorDos", conAplicacion);		
		
		req.getRequestDispatcher("visitas.jsp").forward(req, resp);
	}

	
	
}
















