package com.everis.alicante.becajava.implementaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.interfaces.ClientDAO;


public class ClientDAOJPAImpl implements ClientDAO{

	EntityManager em;
	
	
	@Override
	public int create(Client client) {
		
		em.getTransaction().begin();
		em.persist(client);			
		em.getTransaction().commit();
		
		return client.getIdclient();
		
	}

	@Override
	public Client readById(int id) {		
		
		return em.find(Client.class, id);		
		
	}

	@Override
	public void update(Client client) {
		
		em.getTransaction().begin();
		em.merge(client);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Client client) {
		
		em.getTransaction().commit();
		em.remove(client);
		em.getTransaction().commit();
	}

	public ClientDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Client> findAll() {
	
		Query query = em.createNamedQuery("Client.findAll");		
		
		return query.getResultList();
		
	}

	@Override
	public double findImporteByClient(Client client) {
		
		Query query=em.createNativeQuery("select sum(p.PARKINGPRIZE) from client c "+
										 "	inner join booking b on b.idclient=c.idclient"+
										 "	inner join parkingplace p on b.IDPARKINGPLACE=p.IDPARKINGPLACE"+
										 "	where name= ? ");
		
		query.setParameter(1, client.getName());
		
		return (double) query.getSingleResult();
	}

}
