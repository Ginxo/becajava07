package com.everis.alicante.becajava.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.interfaces.BookingDAO;


public class BookingDAOJPAImpl implements BookingDAO{

	EntityManager em;
	
	@Override
	public void create(Booking Booking) {
		em.getTransaction().begin();
		em.persist(Booking);			
		em.getTransaction().commit();
	}

	@Override
	public Booking readById(int id) {		
		return em.find(Booking.class, id);		
	}

	@Override
	public void update(Booking Booking) {
		em.getTransaction().begin();
		em.merge(Booking);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Booking Booking) {
		em.getTransaction().commit();
		em.remove(Booking);
		em.getTransaction().commit();
	}

	public BookingDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Booking> findAll() {
	
		Query query = em.createNamedQuery("Booking.findAll");		
		
		return query.getResultList();
		
	}
	

}
