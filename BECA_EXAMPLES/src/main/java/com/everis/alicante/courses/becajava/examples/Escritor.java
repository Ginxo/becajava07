package com.everis.alicante.courses.becajava.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.becajava.garage.utils.TextFileUtils;

public class Escritor {

	
	 public static void escribirOutputStream(String data ,String path) throws IOException  {  
		 
		List<String> lista= new ArrayList<>();
		lista.add(data);
		 
		TextFileUtils.saveFile(lista, path);
	}
	 
	
	 
	public static void main(String args[]){
		
		Escritor escritor= new Escritor();
		
		try {
			escritor.escribirOutputStream("hola","output.txt");
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
}
