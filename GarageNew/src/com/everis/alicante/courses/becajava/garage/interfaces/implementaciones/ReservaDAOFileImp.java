package com.everis.alicante.courses.becajava.garage.interfaces.implementaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.interfaces.ClienteDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.VehiculoDAO;

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
		 
		 PlazaDAO daoPlaza= new PlazaDAOFileImp();
		 ClienteDAO daocliente= new ClienteDAOFileImpl();
		 VehiculoDAO daoVehiculo= new VehiculoDAOFileImpl();
		 
		 String linea;
		 
		 File file= new File("src/resources/Reservas.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("CODIGO_RESERVA")||linea.isEmpty()){
				
				Reserva reserva= new Reserva();			
				
				String[] temp= linea.split(";");
				
				reserva.setCodigoReserva(temp[0]);		
								
				reserva.setPlaza(daoPlaza.readPlaza(Integer.parseInt(temp[1])));	
				
				reserva.setCliente(daocliente.readCliente(temp[2]));
								
				reserva.getCliente().setVehiculo(daoVehiculo.readVehiculo(temp[3]));
				
				reservas.put(reserva.getCodigoReserva(),reserva);	
			
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  reservas;
	}

}
