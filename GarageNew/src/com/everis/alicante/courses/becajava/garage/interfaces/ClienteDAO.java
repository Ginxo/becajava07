package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public interface ClienteDAO {

	 Map<String,Cliente> readClientes() throws GarajeException;
	 
	 void createCliente(Cliente cliente) throws IOException;
	 
	 Cliente readCliente(String nif) throws IOException;
	 
	 void deleteCliente(String nif);
	
	
}
