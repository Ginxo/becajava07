package com.everis.alicante.courses.becajava.interfaces;

import java.io.IOException;
import com.everis.alicante.courses.becajava.garaje.domain.Reserva;

public interface ReservaDAO {
	
	void saveReserva(Reserva reserva) throws IOException;
	
}
