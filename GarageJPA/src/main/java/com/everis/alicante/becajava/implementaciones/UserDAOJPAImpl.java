package com.everis.alicante.becajava.implementaciones;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.User;
import com.everis.alicante.becajava.interfaces.UserDAO;

public class UserDAOJPAImpl implements UserDAO {

	EntityManager em;
	
	@Override
	public void insertUser(User user) {
	
		em.getTransaction().begin();
		em.persist(user);			
		em.getTransaction().commit();
		

	}

	@Override
	public User findUserById(int id) {
		
		return em.find(User.class, id);		
	}

	public UserDAOJPAImpl() {
	
		this.em=Persistence.createEntityManagerFactory("GARAGE_JPA").createEntityManager();
		
	}

	@Override
	public void modifyUser(User user) {
	
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
	}

	@Override
	public User findUserByName(String name) {
				
		Query query = em.createNamedQuery("findByName");
		query.setParameter("name", name);
		
		return (User) query.getSingleResult();
	}
	
	
	

}
