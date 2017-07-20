package com.everis.alicante.courses.becajava.garage.interfaces.implementaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAO;

public class PlazaDAOFileImp implements PlazaDAO {

	@Override
	public Map<Integer,Plaza> readPlazas() throws IOException {
						
		 Map<Integer,Plaza> plazas= new TreeMap<Integer,Plaza>();		 
		
		 String linea;
		 
		 File file= new File("src/resources/Plazas.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("NUMERO_PLAZA")||linea.isEmpty()){
				
				Plaza plazaTemp= new Plaza();	
				
				String[] temp= linea.split(";");
				
				plazaTemp.setNumeroPlaza(Integer.parseInt(temp[0]));
				
				plazaTemp.setPrecio(Double.parseDouble(temp[1]));
										
				plazas.put(plazaTemp.getNumeroPlaza(),plazaTemp);	
			
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  plazas;
	}

	@Override
	public void createPlaza(Plaza plaza) {
		
	
		
	}	


	@Override
	public Plaza readPlaza(int numeroPlaza) throws IOException {
			
		 String linea;
		 Plaza plazaTemp = null;
		 
		 File file= new File("src/resources/Plazas.txt");
		 FileReader reader= new FileReader(file);
		 BufferedReader  buffer= new BufferedReader(reader);
		 		 
		 while((linea=buffer.readLine())!=null){				  
			
			if(!linea.contains("NUMERO_PLAZA")||linea.isEmpty()){								
				
				String[] temp= linea.split(";");					
					
				if(numeroPlaza==Integer.valueOf(temp[0])){
					
					plazaTemp= new Plaza();	
					
					plazaTemp.setNumeroPlaza(Integer.parseInt(temp[0]));
					
					plazaTemp.setPrecio(Double.parseDouble(temp[1]));					
									
				}			
			
			}
			
		 }
			 
		 reader.close();		
		 	  	
		return  plazaTemp;
	}

	@Override
	public void deletePlaza(int numeroPlaza) {
		// TODO Auto-generated method stub
		
	}


	
}
