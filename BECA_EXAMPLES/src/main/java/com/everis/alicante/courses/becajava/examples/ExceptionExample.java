package com.everis.alicante.courses.becajava.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	
	
	public static double calcularDivision(double a, double b){
		
		return a/b;
		
	}
	
	public static void readFile() throws FileNotFoundException,NullPointerException, CursoBecaJavaException{
		
//		 File file= new File("src/resources/Clientes.txt");
//		 FileReader reader= new FileReader(file);
//		 BufferedReader  buffer= new BufferedReader(reader);
		 
		 double val=calcularDivision(0,0);
		
		 Coche coche= new Coche();
		 coche=null;
		 
		 try {
			 coche.getColor();
		} catch (Exception e) {
			throw new CursoBecaJavaException();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (NullPointerException e) {
			
			e.printStackTrace();
			
		} catch (CursoBecaJavaException e) {
			
			e.printStackTrace();
		}finally {
			
			//syso
		}
		

	}

}
