package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChatServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ArrayList mensajes;
		
		
		ServletContext contexto = getServletContext();
		
		if(contexto.getAttribute("mensajes")!=null) {
			mensajes=(ArrayList) getServletContext().getAttribute("mensajes");
		}else {
			mensajes=new ArrayList<>();	
		}				
		
		String mensaje=req.getParameter("mensaje");	
		
		String direccion=req.getLocalName();		
		
		mensajes.add(direccion.concat(mensaje));		
		
		contexto.setAttribute("mensajes", mensajes);
		
		resp.sendRedirect("chat.jsp");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	

}
