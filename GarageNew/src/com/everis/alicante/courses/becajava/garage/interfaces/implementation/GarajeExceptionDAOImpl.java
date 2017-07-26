package com.everis.alicante.courses.becajava.garage.interfaces.implementation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.everis.alicante.courses.becajava.garage.domain.GarajeException;
import com.everis.alicante.courses.becajava.garage.interfaces.GarajeExceptionDAO;

public class GarajeExceptionDAOImpl implements GarajeExceptionDAO {

	@Override
	public void create(GarajeException ex) throws IOException  {
			
			 File file= new File("src/resources/Excepciones.txt");
			 FileWriter writer= new FileWriter(file,true);
			 BufferedWriter  buffer= new BufferedWriter(writer);
			
			 buffer.newLine();		 
			 
			 buffer.write(ex.adaptaFormatoTxt());				
			
			 buffer.close();	
			
			
		}

		
	}

