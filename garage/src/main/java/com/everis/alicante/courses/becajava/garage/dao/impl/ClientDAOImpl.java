package com.everis.alicante.courses.becajava.garage.dao.impl;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.dao.ClientDAO;
import com.everis.alicante.courses.becajava.garage.domain.client.Client;
import com.everis.alicante.courses.becajava.garage.utils.TextFileUtils;

public class ClientDAOImpl implements ClientDAO {

	public void create(Client client) throws IOException {
				
		try {
			List<String> clientes=TextFileUtils.loadData("ClientList.txt");
			
			clientes.add(client.toString());
			
			TextFileUtils.saveFile(clientes, "ClientList.txt");			
			
		} catch (IOException e) {
			
			throw e;
		}
		
	}

	public Client read(String nif) {
	
		return null;
	}

	public void update(Client client) {
		
		
	}

	public void delete(Client client) {
	
		
	}

	public List<Client> readAll() {
		
		return null;
	}

	 public static void main(String[] args) throws IOException {	    		    	    	
	    	
	     
		 Client client= new Client("48363825T", "JOSE JUAN", "JIMENEZ", "13/02/1983");
		  
	     ClientDAO dao= new ClientDAOImpl();
	     
	     dao.create(client);
	            
	     
	     
	     
	     
	    }
	
}
