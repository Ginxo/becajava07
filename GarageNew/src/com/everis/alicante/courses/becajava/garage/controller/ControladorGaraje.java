package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.becajava.garage.domain.Plaza;

public interface ControladorGaraje {
	
	Map<Integer, Plaza> listarPlazasLibres() throws IOException;
	void listarPlazasOcupadas() throws IOException;
	boolean reservarPlaza() throws IOException;
	void listarClientes() throws IOException;
	void listarReservas() throws IOException;
	void listarVehiculos() throws IOException;

}
