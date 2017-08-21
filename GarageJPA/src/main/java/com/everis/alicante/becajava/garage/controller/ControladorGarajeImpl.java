package com.everis.alicante.becajava.garage.controller;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.implementaciones.BookingDAOJPAImpl;
import com.everis.alicante.becajava.implementaciones.ClientDAOJPAImpl;
import com.everis.alicante.becajava.implementaciones.ParkingPlaceDAOJPAImpl;
import com.everis.alicante.becajava.implementaciones.VehicleDAOJPAImpl;
import com.everis.alicante.becajava.interfaces.BookingDAO;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.ParkingPlaceDAO;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.BookingService;
import com.everis.alicante.becajava.services.ClientService;
import com.everis.alicante.becajava.services.ParkingPlaceService;
import com.everis.alicante.becajava.services.VehicleService;
import com.everis.alicante.becajava.services.implementaciones.BookingServiceImpl;
import com.everis.alicante.becajava.services.implementaciones.ClientServiceImpl;
import com.everis.alicante.becajava.services.implementaciones.ParkingPlaceServiceImpl;
import com.everis.alicante.becajava.services.implementaciones.VehicleServiceImpl;

public class ControladorGarajeImpl implements ControladorGaraje{

	static Logger log=Logger.getLogger(ControladorGarajeImpl.class);

	ClientService serviceClient;
	BookingService bookingService;
	ParkingPlaceService parkingService;
	VehicleService vehicleService;
	
	EntityManager em;
	ClientDAO clientDao;
	BookingDAO bookingDao;
	ParkingPlaceDAO parkinPlaceDao;
	VehicleDAO vehicleDao;
	
	
	@Override
	public List<Parkingplace> listarPlazasLibres() {
		
		return parkingService.listFreePlaces();
	}



	@Override
	public boolean reservarPlaza(Client client,Vehicle vehicle) {
		
		Booking booking= new Booking();
		booking.setBookingdate(Calendar.getInstance().getTime());
		booking.setClient(client);
		booking.setVehicle(vehicle);
		
		Set<Booking> bookings=new HashSet<>();
		bookings.add(booking);		
		
		vehicle.setBookings(bookings);
		client.setBookings(bookings);
	
		Parkingplace place=this.parkingService.getFreePlace();
		place.setBookings(bookings);
		booking.setParkingplace(place);
		place.setParkingstate((byte) 1);
		this.bookingService.create(booking);
		
		return true;
		
	}

	@Override
	public List<Client> listarClientes() {
		
		return this.serviceClient.listClients();		
		
	}

	@Override
	public List<Booking> listarReservas() {
		
		return this.bookingService.list();
		
	}

	@Override
	public List<Vehicle> listarVehiculos(){
		
		return this.vehicleService.list();
		
	}

	@Override
	public List<Booking> listarReservasByFecha(Date fechaInicio, Date fechaFin) {
		
		return null;
	}

	public ControladorGarajeImpl() {
		
		this.em=Persistence.createEntityManagerFactory("GARAGE_JPA").createEntityManager();
		this.clientDao= new ClientDAOJPAImpl(em);
		this.parkinPlaceDao=new ParkingPlaceDAOJPAImpl(em);
		this.vehicleDao=new VehicleDAOJPAImpl(em);
		this.bookingDao= new BookingDAOJPAImpl(em);
		this.serviceClient=new ClientServiceImpl(clientDao);
		this.bookingService=new BookingServiceImpl(bookingDao);
		this.vehicleService= new VehicleServiceImpl(vehicleDao);
		this.parkingService= new ParkingPlaceServiceImpl(parkinPlaceDao);
		
	}



	@Override
	public double findImporteCliente(Client client) {
		
		System.out.println("El cliente : " + client.getName()+" debe : "+serviceClient.getImporteByClient(client) +"EUR");
		
		return serviceClient.getImporteByClient(client);
	}




		


}
