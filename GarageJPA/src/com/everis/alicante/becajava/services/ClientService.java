package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;

public interface ClientService {
	
		
	List<Client> listClients();
	
	void updateCliente(Client client);
	
	Client findCliente(Client client);

	void createClient(Client client);
	
	
	
	
}
