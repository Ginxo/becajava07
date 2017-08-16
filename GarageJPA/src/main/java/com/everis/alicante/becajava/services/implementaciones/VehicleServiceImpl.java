package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {
	
	VehicleDAO vehicleDao;

	public VehicleServiceImpl(VehicleDAO vehicleDao) {
		super();
		this.vehicleDao = vehicleDao;
	}

	@Override
	public List<Vehicle> list() {
		
		return vehicleDao.findAll();
	}
	
	

}
