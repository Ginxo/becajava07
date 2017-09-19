package com.everis.alicante.becajava.servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.domain.Vehicle;
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
		
		ControladorGaraje controlador= new ControladorGarajeImpl();
		
		switch (option) {
		case 1:	
			List<Parkingplace> plazas = controlador.listarPlazasLibres();		
			req.setAttribute("plazas", plazas);	
			RequestDispatcher dispatcher = req.getRequestDispatcher("listadoPlazas.jsp");
			dispatcher.forward(req, resp);
			break;
		
		case 3 :
			List<Parkingplace> plazasLibres = controlador.listarPlazasLibres();		
			req.setAttribute("plazas", plazasLibres);			
			RequestDispatcher dispatcher2 = req.getRequestDispatcher("altaReserva.jsp");
			dispatcher2.forward(req, resp);
			
		case 5 :
			List<Booking> reservas=controlador.listarReservas();			
			req.setAttribute("reservas", reservas);			
			RequestDispatcher dispatcher3 = req.getRequestDispatcher("listadoReservas.jsp");
			dispatcher3.forward(req, resp);
			
			break;

		default:
			break;
		}
		
	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//alta de reservas
		
		String name=req.getParameter("name");
		String surname=req.getParameter("surname");
		String nif=req.getParameter("nif");
		String tlf=req.getParameter("tlf");
		String plate=req.getParameter("plate");
		String vehicleModel=req.getParameter("vehicleModel");
				
		Vehicle vehicle= new Vehicle();
		vehicle.setVehiclemodel(vehicleModel);
		vehicle.setVehicleplate(plate);
		
		Set<Vehicle> vehicles= new HashSet<>();
		vehicles.add(vehicle);
		
		Client client= new Client();
		client.setName(name);
		client.setSurname(surname);
		client.setNif(nif);
		client.setTelephone(tlf);
		client.setVehicles(vehicles);
		
		vehicle.setClient(client);
		
		ControladorGaraje controladorGaraje= new ControladorGarajeImpl();
		controladorGaraje.reservarPlaza(client, vehicle);
		
		resp.sendRedirect("menu.jsp");
		
	}
	
	
	
	

}
