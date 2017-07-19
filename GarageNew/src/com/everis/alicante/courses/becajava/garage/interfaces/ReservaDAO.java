package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.becajava.garage.domain.Reserva;

public interface ReservaDAO {
	
	Map<String,Reserva> readReservas() throws IOException;
	
	void createReserva(Reserva reserva)  throws IOException;
	
	
}
