package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConversorServlet extends HttpServlet {
		
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("###" + req.getRemoteAddr());
		System.out.println("###" + req.getRemoteHost());
		
		
		int moneda = Integer.parseInt(req.getParameter("moneda"));	
		double parametro = Double.parseDouble(req.getParameter("cantidad"));
		double resultado = 0;
		
		switch (moneda) {
			case 0:
				resultado = parametro * 1.5;
				break;
			case 1:
				resultado = parametro / 1.5;
				break;
		}
		
		PrintWriter salida = resp.getWriter();
		salida.print("<html>");
		salida.print("<body>");
		salida.print("El resultado de la conversion es:");
		salida.print(resultado);
		salida.print("</body>");
		salida.print("</html>");
	}

}












