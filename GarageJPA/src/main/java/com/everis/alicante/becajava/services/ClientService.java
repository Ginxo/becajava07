package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;

public interface ClientService {
	
		
	List<Client> listClients();
	
	void updateCliente(Client client);
	
	Client findCliente(Client client);

	void createClient(Client client);
	
	double getImporteByClient(Client client);
	
	
	
}
