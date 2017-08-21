package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFin extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		PrintWriter salida = resp.getWriter();
		
		salida.print("<html>");
		salida.print("<body>");
		salida.print("Parametro nombre: ");
		// valor del primer parametro
		salida.print(req.getParameter("nombre"));

		salida.print("<br />");
		salida.print("Parametro desde el servlet: ");
		// valor del parametro desde el servlet
		salida.print(req.getAttribute("param1"));
		
		salida.print("</body>");
		salida.print("</html>");
		
	}
	
}
