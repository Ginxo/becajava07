package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Parkingplace;

public interface ParkingPlaceService {  
	
	
	List<Parkingplace> list();
	
	Parkingplace getFreePlace();
	
	List<Parkingplace> listFreePlaces();	

}
