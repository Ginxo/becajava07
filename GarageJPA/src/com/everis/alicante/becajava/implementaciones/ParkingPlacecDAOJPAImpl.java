package com.everis.alicante.becajava.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.interfaces.ParkingPlaceDAO;


public class ParkingPlacecDAOJPAImpl implements ParkingPlaceDAO{

	EntityManager em;
	
	
	@Override
	public void create(Parkingplace parkingplace) {
		
		em.getTransaction().begin();
		em.persist(parkingplace);			
		em.getTransaction().commit();
		
	}

	@Override
	public Parkingplace readById(int id) {		
		
		return em.find(Parkingplace.class, id);		
		
	}

	@Override
	public void update(Parkingplace parkingplace) {
		
		em.getTransaction().begin();
		em.merge(parkingplace);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Parkingplace parkingplace) {
		
		em.getTransaction().commit();
		em.remove(parkingplace);
		em.getTransaction().commit();
	}

	public ParkingPlacecDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Parkingplace> findAll() {
	
		Query query = em.createNamedQuery("Parkingplace.findAll");		
		
		return query.getResultList();
		
	}
	

}
