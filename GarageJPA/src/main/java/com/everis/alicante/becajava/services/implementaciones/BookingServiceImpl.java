package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.interfaces.BookingDAO;
import com.everis.alicante.becajava.services.BookingService;


public class BookingServiceImpl implements BookingService {

	
	BookingDAO bookingDao;	
	
	@Override
	public void create(Booking booking) {	
		
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

	public BookingServiceImpl(BookingDAO bookingDao) {
		super();
		this.bookingDao = bookingDao;
	}
	
	

	

	

}
