package com.everis.alicante.courses.becajava.garage.interfaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;

public class ReservaDAOFileImp implements ReservaDAO {

	@Override
	public void saveReserva(Reserva reserva) throws IOException {
		
		 
		 File file= new File("src/resources/Reservas.txt");
		 FileWriter writer= new FileWriter(file,true);
		 BufferedWriter  buffer= new BufferedWriter(writer);
		
		 buffer.newLine();		 
		 
		 buffer.write(reserva.convierteAFormatoTxt());		
		
		 buffer.close();
		

	}
	
	@Override
	public List<Reserva> readReservas() throws IOException {
						
		 List<Reserva> reservas= new ArrayList<Reserva>();		 
		
		 String linea;
		 
		 File file= new File("src/resources/Reservas.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("CODIGO_RESERVA")||linea.isEmpty()){
				
				Reserva reserva= new Reserva();			
				
				String[] temp= linea.split(";");
				
				reserva.setCodigoReserva(temp[0]);		
				
				Plaza plaza=GarageMain.getGaraje().getPlazas().get(Integer.parseInt(temp[1]));
				
				reserva.setPlaza(plaza);							
										
				reservas.add(reserva);	
			
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  reservas;
	}


	public static void main(String args[]) throws IOException{
		
		Reserva reserva= new Reserva();
		
		Cliente cliente= new Cliente();
		cliente.setNif("678678687687");
		
		Plaza plaza= new Plaza();
		plaza.setNumeroPlaza(1);		
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMatricula("2345 GHF");
		
		cliente.setVehiculo(vehiculo);		
		reserva.setCliente(cliente);
		reserva.setPlaza(plaza);
		reserva.setFechaReserva(Calendar.getInstance().getTime());
		
		ReservaDAO dao= new ReservaDAOFileImp();
		
		dao.saveReserva(reserva);
		
		
		
	}

}
