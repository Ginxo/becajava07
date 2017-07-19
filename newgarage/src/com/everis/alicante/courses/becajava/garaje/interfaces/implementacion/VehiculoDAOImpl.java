package com.everis.alicante.courses.becajava.garaje.interfaces.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garaje.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garaje.interfaces.VehiculoDAO;

public class VehiculoDAOImpl implements VehiculoDAO {

	@Override
	public Map<String,Vehiculo> readVehiculos() throws IOException {
		
		Map<String,Vehiculo> vehiculos= new TreeMap<String,Vehiculo>();		 
		
		 String linea;
		 
		 File file= new File("src/resources/Vehiculo.txt");
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

	public List<Vehiculo> readVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(Vehiculo[] vehiculo) {
		// TODO Auto-generated method stub
		
	}

}