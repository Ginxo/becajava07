package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.interfaces.ParkingPlaceDAO;
import com.everis.alicante.becajava.services.ParkingPlaceService;

public class ParkingPlaceServiceImpl implements ParkingPlaceService {

	ParkingPlaceDAO parkingPlaceDao;

	public ParkingPlaceServiceImpl(ParkingPlaceDAO parkingPlaceDao) {
		super();
		this.parkingPlaceDao = parkingPlaceDao;
	}

	@Override
	public List<Parkingplace> list() {
	
		return parkingPlaceDao.findAll();
	}

	@Override
	public Parkingplace getFreePlace() {
	
		int id=parkingPlaceDao.findFreeParkingPlace();
		return parkingPlaceDao.readById(id);
		
	}

	@Override
	public List<Parkingplace> listFreePlaces() {
		
		return parkingPlaceDao.findFreeParkingPlaces();
	}
	
	
	
}
