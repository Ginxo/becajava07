package com.everis.alicante.courses.becajava.garage.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorNIF {
	
	
	public static boolean validaNif(String nif){
		 		 
		 boolean correcto = false;

		 Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

		 Matcher matcher = pattern.matcher(nif);

		 if (matcher.matches()) {

		        String letra = matcher.group(2);
		        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		        int index = Integer.parseInt(matcher.group(1));
		        index = index % 23;
		        String reference = letras.substring(index, index + 1);
		        if (reference.equalsIgnoreCase(letra)) {
		            correcto = true;
		        } else {
		            correcto = false;
		        }
		    } else {
		        correcto = false;
		    }
		 
		 return correcto;
		
	}
	
	public static void main(String args[]){
		
		System.out.println(validaNif("48363825T"));
		
		
	}

}
