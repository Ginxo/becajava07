package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import com.everis.alicante.courses.becajava.garage.domain.Plaza;

public interface ControladorGaraje {
	
	Map<Integer, Plaza> listarPlazasLibres() throws IOException, ParseException;
	void listarPlazasOcupadas() throws IOException, ParseException;
	boolean reservarPlaza() throws IOException, ParseException;
	void listarClientes() throws IOException;
	void listarReservas() throws IOException, ParseException;
	void listarVehiculos() throws IOException;
	void listarReservasByFecha(Date fechaInicio,Date fechaFin) throws IOException, ParseException;

}
