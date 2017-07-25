package com.everis.alicante.courses.becajava.garaje.interfaces;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.becajava.garaje.domain.Cliente;

public interface ClienteDAO {

	 Map<String,Cliente> readClientes() throws IOException;
	 
	 void createCliente(Cliente cliente) throws IOException;
	 
	 Cliente readCliente(String nif) throws IOException;
	 
	 void deleteCliente(String nif);
	
	
}