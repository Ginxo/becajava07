package com.everis.alicante.courses.becajava.garaje.interfaces;

import java.io.IOException;

public interface ControladorGaraje {
	
	void listarPlazasLibres();
	void listarPlazasOcupadas();
	boolean reservarPlaza() throws IOException;
	void listarClientes();

}