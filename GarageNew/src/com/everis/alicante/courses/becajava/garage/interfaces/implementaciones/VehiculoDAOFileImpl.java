package com.everis.alicante.courses.becajava.garage.interfaces.implementaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garage.interfaces.VehiculoDAO;

public class VehiculoDAOFileImpl implements VehiculoDAO {

	@Override
	public Map<String,Vehiculo> readVehiculos() throws IOException {
		
		Map<String,Vehiculo> vehiculos= new TreeMap<String,Vehiculo>();		 
		
		 String linea;
		 
		 File file= new File("src/resources/Vehiculos.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("MATRICULA")||linea.isEmpty()){
				
				Vehiculo vehiculo= new Vehiculo();			
				
				String[] temp= linea.split(";");
				
				vehiculo.setMatricula(temp[0]);		
				
				vehiculo.setTipoVehiculo(temp[1]);					
										
				vehiculos.put(vehiculo.getMatricula(), vehiculo);
			
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  vehiculos;
	}

	@Override
	public void createVehiculo() {
		
	}

}
