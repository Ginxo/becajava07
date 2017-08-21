package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {

		private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			// Obtenemos un objeto Print Writer para enviar respuesta
			
			String p=req.getParameter("param");
			
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.println("<html><head>");
			pw.println("<TITLE>Servlet Maven</TITLE>");
			pw.println("</head><body>");
			pw.println("<p>Hola Mundo "+p+"</p>");
			pw.println("</body>");
			pw.close();
		}
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			doGet(req,res);
		}
	

}
