package com.everis.alicante.courses.becajava.interfaces;

import java.io.BufferedWriter;
import java.io.IOException;
import com.everis.alicante.courses.becajava.garaje.domain.Reserva;

public class ReservaDAOFileImp implements ReservaDAO{

	@Override
	public void saveReserva(Reserva reserva) throws IOException {
		
		
		File file = new File("src/resources/Resources.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter buffer = new BufferedWriter(writer);
		
		buffer.write(reserva.getPlaza().getNumeroPlaza());
		buffer.write(";");
		buffer.write(reserva.getCliente().getNif());
		buffer.write(";");
		
	}
	
	public static void main(String args[]) throws