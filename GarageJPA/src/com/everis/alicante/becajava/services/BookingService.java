package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.domain.Vehicle;

public interface BookingService {
	
		
	List<Booking>list();
	
	Booking findBooking(String field);

	void create(Booking booking);

}
