package com.everis.alicante.courses.becajava.garaje.controller;

import java.io.IOException;
import java.text.ParseException;

import com.everis.alicante.courses.becajava.garaje.GarageMain;
import com.everis.alicante.courses.becajava.garaje.domain.GarajeException;

public interface ControladorExcepciones {	
	
	default void gestionaExcepcion(GarajeException e) {
		
		e.gestionaExcepcion();
	
		try {
			GarageMain.iniciarAplicacion();
		} catch (IOException | ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
