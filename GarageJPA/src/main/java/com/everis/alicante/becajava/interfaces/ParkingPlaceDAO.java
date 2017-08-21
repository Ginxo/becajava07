package com.everis.alicante.becajava.interfaces;

import java.util.List;

import com.everis.alicante.becajava.domain.Parkingplace;

public interface ParkingPlaceDAO {
	
	void create(Parkingplace parkingPlace);
	
	Parkingplace readById(int id);
	
	void update(Parkingplace parkingPlace);
	
	void delete(Parkingplace parkingPlace);
	
	List<Parkingplace> findAll();
	
	int findFreeParkingPlace();
	
	List<Parkingplace> findFreeParkingPlaces();
		

}
