package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.interfaces.BookingDAO;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.BookingService;


public class BookingServiceImpl implements BookingService {

	
	BookingDAO bookingDao;	
	ClientDAO clientDao;
	VehicleDAO vehicleDao;

	
	@Override
	public void create(Booking booking,Client client,Vehicle vehicle) {		
		
		clientDao.create(client);
		
		vehicleDao.create(vehicle);		
		
		bookingDao.create(booking);

	}

	@Override
	public List<Booking> list() {
	
		return  bookingDao.findAll();
	}

	@Override
	public Booking findBooking(String field) {
		
		//lo implemementaremos luego
		
		return null;
	}

	public BookingDAO getBookingDao() {
		return bookingDao;
	}

	public void setBookingDao(BookingDAO bookingDao) {
		this.bookingDao = bookingDao;
	}

	public ClientDAO getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}

	public VehicleDAO getVehicleDao() {
		return vehicleDao;
	}

	public void setVehicleDao(VehicleDAO vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

	
	
	

}
