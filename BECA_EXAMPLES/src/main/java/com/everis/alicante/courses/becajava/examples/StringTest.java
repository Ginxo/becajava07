package com.everis.alicante.courses.becajava.examples;

public class StringTest {

	public static void main(String[] args) {
		
		
		String entrada="Mi hija menor tiene 10 años y su padre tiene 45";
		
		
		String[] salida = entrada.split(" ");
		
		for (int i = 0; i < salida.length; i++) {
			
		
			try {
				double numero=Double.parseDouble(salida[i]);
				
				
				if (numero>20) {
					System.out.println("El numero : "+numero+" es mayor que 20");					
				}
				else{
					System.out.println("El numero : "+numero+" es menor que 20");	
				}
			} catch (Exception e) {
				
			}
			
			
		}
		

	}

}
