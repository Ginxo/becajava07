package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;
import java.text.ParseException;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public class ControladorExcepcionesImpl implements ControladorExcepciones{

	@Override
	public void gestionaExcepcion(GarajeException e) {		
		
		e.gestionaExcepcion();
		
		//guarda la excepcion entera en un fichero de excepciones
		
		try {
			GarageMain.iniciarAplicacion();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		} catch (ParseException e1) {
		
			e1.printStackTrace();
		}
		
	}

}
	