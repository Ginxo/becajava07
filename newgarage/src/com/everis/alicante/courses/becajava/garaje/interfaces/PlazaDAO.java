package com.everis.alicante.courses.becajava.garaje.interfaces;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.becajava.garaje.domain.Plaza;

public interface PlazaDAO {
	
	Map<Integer, Plaza> readPlazas() throws IOException;
	
	void createPlaza(Plaza plaza);
	
	Plaza readPlaza(int numeroPlaza) throws IOException;
	
	void deletePlaza(int numeroPlaza);
	
	//falta el update

}
