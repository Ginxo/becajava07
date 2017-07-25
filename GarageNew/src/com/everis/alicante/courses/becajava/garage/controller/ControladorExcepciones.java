package com.everis.alicante.courses.becajava.garage.controller;

import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public interface ControladorExcepciones {	
	
	void gestionaExcepcion(GarajeException exception);
	
}