package com.everis.alicante.becajava.garage.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.becajava.garage.domain.Plaza;
import com.everis.alicante.becajava.garage.domain.PlazaCoche;
import com.everis.alicante.becajava.garage.domain.PlazaMoto;

public class Lector {
	
	
	 public List<Plaza> readPlazas() throws IOException{
		 
		 List<Plaza> plazas= new ArrayList<Plaza>();
		 
		 File file=new File("C:\\plazas.txt");
		 
		 FileReader reader= new FileReader(file);
		 
		 BufferedReader buffer=new BufferedReader(reader);
		 
		 String line;	
				
		 while((line=buffer.readLine())!=null){				  
					
			if(!line.contains("NUMERO_PLAZA;PRECIO;TAMAÑO;TIPO")) {
							
				String[] var = line.split(";");
				
				if(var[3].equals("COCHE")) {
					
					Plaza plazaTemp= new PlazaCoche();						
					plazaTemp.setNumeroPlaza(Integer.parseInt(var[0]));
					plazaTemp.setPrecio(Double.parseDouble(var[1]));
					plazaTemp.setMetrosCuadrados(Double.parseDouble(var[2]));
					
					plazas.add(plazaTemp);
					
				}
				if(var[3].equals("MOTO")) {
					
					Plaza plazaTemp= new PlazaMoto();						
					plazaTemp.setNumeroPlaza(Integer.parseInt(var[0]));
					plazaTemp.setPrecio(Double.parseDouble(var[1]));
					plazaTemp.setMetrosCuadrados(Double.parseDouble(var[2]));
					
					plazas.add(plazaTemp);
				}				
				
			}
					
		 }			
					
		buffer.close();		
		
		 
		return plazas;
	 }

}
