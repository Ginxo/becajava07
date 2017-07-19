package com.everis.alicante.courses.becajava.garage.interfaces.implementaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAO;

public class ReservaDAOFileImp implements ReservaDAO {

	@Override
	public void createReserva(Reserva reserva) throws IOException {
		
		 
		 File file= new File("src/resources/Reservas.txt");
		 FileWriter writer= new FileWriter(file,true);
		 BufferedWriter  buffer= new BufferedWriter(writer);
		
		 buffer.newLine();		 
		 
		 buffer.write(reserva.convierteAFormatoTxt());		
		
		 buffer.close();
		

	}
	
	
	@Override
	public Map<String,Reserva> readReservas() throws IOException {
						
		 Map<String,Reserva> reservas= new TreeMap<String,Reserva>();		 
		
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
				
				reserva.setCliente(GarageMain.getGaraje().getClientes().get(temp[2]));
								
				reserva.getCliente().setVehiculo(GarageMain.getGaraje().getVehiculos().get(temp[3]));
				
				reservas.put(reserva.getCodigoReserva(),reserva);	
			
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
		
		dao.createReserva(reserva);
		
		
		
	}

}
