package com.everis.alicante.courses.becajava.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lector {
	
	
	 public static void leerInputStream(String path) throws IOException  {  
	   
		 FileInputStream in = null;
	  

	      try {
	         in = new FileInputStream(path);
	       	         
	         int c;
	         while ((c = in.read()) != -1) {	        	
//	            System.out.println(c);
//	            System.err.println((char)c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();	         }
	        
	      }
	}
	 
	 
	 public static void leerFileReader(String path) throws IOException  {  
		   
		 FileReader in = null;
	  

	      try {
	         in = new FileReader(path);
	       	         
	         int c;
	         while ((c = in.read()) != -1) {
//	            System.out.println(c);
//	            System.err.println((char)c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();	         }
	        
	      }
	}
	 
	 public static void leerBufferedReader(String path) throws IOException{
		 
		 List data= new ArrayList<String>();
		 
		 FileReader reader=new FileReader(path);
		 
		 BufferedReader buffer= new BufferedReader(reader);
		 
		 String line;
		 
			 try {
					while((line=buffer.readLine())!=null){				  
						data.add(line);					
					}
				} catch (IOException e) {
						throw e;
				}
		        finally {
					buffer.close();
				}
		 
			System.out.println(data);
		 
	 }
	 
	public static void main(String args[]){
		
		Lector reader= new Lector();
		
		try {
			reader.leerInputStream("src/main/resources/input.txt");
			reader.leerFileReader("src/main/resources/input.txt");
			reader.leerBufferedReader("src/main/resources/input.txt");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
