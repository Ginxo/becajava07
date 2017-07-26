package com.everis.alicante.courses.becajava.garage.controller;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;
import com.everis.alicante.courses.becajava.garage.interfaces.GarajeExceptionDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.implementation.GarajeExceptionDAOImpl;

public interface ControladorExcepciones {	
	
	static Logger log=Logger.getLogger(ControladorExcepciones.class);
	
	
	default void gestionaExcepcion(GarajeException e) {
		
		e.gestionaExcepcion();
		
		GarajeExceptionDAO dao= new GarajeExceptionDAOImpl();
		
		try {
			dao.create(e);
			
		} catch (IOException e1) {
			
			log.error(e1.getStackTrace());
		}
	
		GarageMain.iniciarAplicacion();
	}
	
}