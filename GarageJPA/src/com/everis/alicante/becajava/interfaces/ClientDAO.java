package com.everis.alicante.becajava.interfaces;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;

public interface ClientDAO {
	
	void create(Client client);
	
	Client readById(int id);
	
	void update(Client client);
	
	void delete(Client client);
	
	List<Client> findAll();
		

}
