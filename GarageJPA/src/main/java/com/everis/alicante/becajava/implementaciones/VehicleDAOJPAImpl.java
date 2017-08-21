package com.everis.alicante.becajava.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.interfaces.VehicleDAO;


public class VehicleDAOJPAImpl implements VehicleDAO{

	EntityManager em;
	
	
	@Override
	public int create(Vehicle vehicle) {
		
		em.getTransaction().begin();
		em.persist(vehicle);			
		em.getTransaction().commit();
		
		return 1;
		
	}

	@Override
	public Vehicle readById(int id) {		
		
		return em.find(Vehicle.class, id);		
		
	}

	@Override
	public void update(Vehicle vehicle) {
		
		em.getTransaction().begin();
		em.merge(vehicle);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Vehicle vehicle) {
		
		em.getTransaction().commit();
		em.remove(vehicle);
		em.getTransaction().commit();
	}

	public VehicleDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Vehicle> findAll() {
	
		Query query = em.createNamedQuery("Vehicle.findAll");		
		
		return query.getResultList();
		
	}
	

}
