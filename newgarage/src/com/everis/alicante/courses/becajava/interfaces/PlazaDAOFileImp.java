package com.everis.alicante.courses.becajava.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.becajava.garaje.domain.Plaza;

public class PlazaDAOFileImp implements PlazaDAO {

	@Override
	public List readPlazas() throws IOException {
		// TODO Auto-generated method stub
		
		List plazas = new ArrayList<Plaza>();
		String linea;
		
		File file = new File("src/resources/Plazas.txt");
		FileReader reader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		
		while((linea=buffer.readLine())!=null){
			
			if(!linea.contains("NUMERO_PLAZA")||linea.isEmpty()){
			
				Plaza plazaTemp = new Plaza();
				
				String[] temp = linea.split(";");
				
			plazaTemp.setNumeroPlaza(Integer.parseInt(temp[0]));
			
			plazaTemp.setPrecio(Double.parseDouble(temp[1]));
			
			plazas.add(plazaTemp);
		}
		}
		
		reader.close();
		
		return plazas;
	}

	@Override
	public void write(Plaza[] plazas) {

	}
	


	public static void main(String args[]) throws IOException {
		PlazaDAO dao = new PlazaDAOFileImp();
		dao.readPlazas();
	}
}