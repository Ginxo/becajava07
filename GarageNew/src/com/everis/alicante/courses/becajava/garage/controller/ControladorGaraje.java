package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;

public interface ControladorGaraje {
	
	void listarPlazasLibres() throws IOException;
	void listarPlazasOcupadas() throws IOException;
	boolean reservarPlaza() throws IOException;
	void listarClientes() throws IOException;
	void listarReservas() throws IOException;
	void listarVehiculos() throws IOException;

}
