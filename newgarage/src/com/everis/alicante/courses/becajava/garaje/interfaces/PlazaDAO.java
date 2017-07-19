package com.everis.alicante.courses.becajava.garaje.interfaces;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.courses.becajava.garaje.domain.Plaza;

public interface PlazaDAO {
	
	List<Plaza> readPlazas() throws IOException;
	
	void write(Plaza[] plazas);

}
