package com.everis.alicante.becajava.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		//leer el parametro
		
		String nombre = req.getParameter("nombre");		
				
//		resp.sendRedirect("informacion.jsp");
		
		req.setAttribute("nombre", nombre);
		RequestDispatcher dispatcher = req.getRequestDispatcher("informacion.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	
	

}
