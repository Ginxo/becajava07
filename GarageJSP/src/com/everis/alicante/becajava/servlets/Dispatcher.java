package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.garage.controller.ControladorGaraje;
import com.everis.alicante.becajava.garage.controller.ControladorGarajeImpl;

public class Dispatcher extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int option=Integer.parseInt(req.getParameter("option"));
		
		System.out.println("##option"+ option);
		
		
		
		switch (option) {
		case 1:
			
			ControladorGaraje controlador= new ControladorGarajeImpl();
			List<Parkingplace> plazas = controlador.listarPlazasLibres();
		
			req.setAttribute("plazas", plazas);
			
			// Reenvio de la peticion
			RequestDispatcher dispatcher = req.getRequestDispatcher("listadoPlazas.jsp");
			dispatcher.forward(req, resp);
			
		
			break;

		default:
			break;
		}
		
	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//doGet(req, resp);
	}
	
	
	
	

}
