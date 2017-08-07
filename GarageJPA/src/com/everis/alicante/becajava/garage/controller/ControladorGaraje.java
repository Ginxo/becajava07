package com.everis.alicante.becajava.garage.controller;

import java.util.Date;
import java.util.Map;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.domain.Vehicle;

public interface ControladorGaraje {
	
	Map<Integer, Parkingplace> listarPlazasLibres();
	void listarPlazasOcupadas();	
	void listarClientes();
	void listarReservas();
	void listarVehiculos();
	void listarReservasByFecha(Date fechaInicio,Date fechaFin);
	boolean reservarPlaza(Client client, Vehicle vehicle);

}
