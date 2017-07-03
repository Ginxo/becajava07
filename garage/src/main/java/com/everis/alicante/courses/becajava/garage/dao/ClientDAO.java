package com.everis.alicante.courses.becajava.garage.dao;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.domain.client.Client;

public interface ClientDAO {

	
	public void create(Client client) throws IOException;
	public Client read(String nif) throws IOException;;
	public void update(Client client) throws IOException;;
	public void delete(Client client) throws IOException;;
	
	public List<Client> readAll();
}
