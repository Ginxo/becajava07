package com.everis.alicante.becajava.interfaces;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;

public interface VehicleDAO {
	
	int create(Vehicle vehicle);
	
	Vehicle readById(int id);
	
	void update(Vehicle vehicle);
	
	void delete(Vehicle vehicle);
	
	List<Vehicle> findAll();
		

}
