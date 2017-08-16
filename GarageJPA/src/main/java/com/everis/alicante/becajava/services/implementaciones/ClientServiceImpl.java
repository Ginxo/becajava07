package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {
	
	private ClientDAO clientDao;
		
	@Override
	public void createClient(Client client) {
		
		clientDao.create(client);		
		
	}

	@Override
	public List<Client> listClients() {
		
		return clientDao.findAll();
		
	}

	@Override
	public void updateCliente(Client client) {
		
		clientDao.update(client);

	}

	@Override
	public Client findCliente(Client client) {
		
		return clientDao.readById(client.getIdclient());
	}

	
	public ClientDAO getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDAO clientDao) {
		this.clientDao = clientDao;
	}

	public ClientServiceImpl(ClientDAO clientDao) {
		super();
		this.clientDao = clientDao;
	}

	@Override
	public double getImporteByClient(Client client) {
	
		return this.clientDao.findImporteByClient(client);
	}

	
	
	
	
	
}
