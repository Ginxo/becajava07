package com.everis.alicante.becajava.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletInicio extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("### Traza desde ServletInicio");
		
		int tipoEnvio = Integer.parseInt(req.getParameter("tipoEnvio"));
		
		// paso de parametros
		Integer entero = new Integer(10);
		req.setAttribute("param1", entero);
		
		if (tipoEnvio == 0) {
			// Redireccion
			resp.sendRedirect("servletFin");

		} else {
			// Reenvio de la peticion
			RequestDispatcher dispatcher = req.getRequestDispatcher("servletFin");
			dispatcher.forward(req, resp);
		}
	}

	
	
}










