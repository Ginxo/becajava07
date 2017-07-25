package com.everis.alicante.courses.becajava.garage.controller;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public interface ControladorExcepciones {	
	
	default void gestionaExcepcion(GarajeException e) {
		
		e.gestionaExcepcion();
	
		GarageMain.iniciarAplicacion();
	}
	
}