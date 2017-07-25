package com.everis.alicante.courses.becajava.garaje.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import com.everis.alicante.courses.becajava.garaje.domain.GarajeException;
import com.everis.alicante.courses.becajava.garaje.domain.Plaza;

public interface ControladorGaraje {
	
	Map<Integer, Plaza> listarPlazasLibres() throws IOException, ParseException, GarajeException;
	void listarPlazasOcupadas() throws IOException, ParseException, GarajeException;
	boolean reservarPlaza() throws IOException, ParseException, GarajeException;
	void listarClientes() throws IOException, GarajeException;
	void listarReservas() throws IOException, ParseException, GarajeException;
	void listarVehiculos() throws IOException, GarajeException;
	void listarReservasByFecha(Date fechaInicio,Date fechaFin) throws IOException, ParseException, GarajeException;

}