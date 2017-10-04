package com.everis.alicante.becajava.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);				
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String valor1= req.getParameter("VALOR1");
		String valor2= req.getParameter("VALOR2");
		
		req.setAttribute("resultado", valor1+valor2);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("formularioCalculadora.jsp");
		dispatcher.forward(req, resp);
	}

       
  

}
