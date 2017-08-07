package com.everis.alicante.becajava.services.implementaciones;

import java.util.List;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.interfaces.ClientDAO;
import com.everis.alicante.becajava.interfaces.VehicleDAO;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService {
	
	private ClientDAO clientDao;
	
	private VehicleDAO vehicleDao;

	@Override
	public void createClient(Client client , Vehicle vehicle) {
		
		clientDao.create(client);		
		vehicleDao.create(vehicle);
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

	public VehicleDAO getVehicleDao() {
		return vehicleDao;
	}

	public void setVehicleDao(VehicleDAO vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

	
	
	
}
