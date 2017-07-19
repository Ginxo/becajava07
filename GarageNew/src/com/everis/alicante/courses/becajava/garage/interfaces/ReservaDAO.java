package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.IOException;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.domain.Reserva;

public interface ReservaDAO {
	
	void saveReserva(Reserva reserva)  throws IOException;
	
	List<Reserva> readReservas() throws IOException;

}
