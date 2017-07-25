package com.everis.alicante.courses.becajava.examples;

public class CursoBecaJavaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2369097624288196090L;

	@Override
	public void printStackTrace() {
	
		System.out.println("Ha ocurrido un error por el motivo: " + super.getCause());
		
		for (int i = 0; i < 10; i++) {
			int j=0;
			
			if(true){
				
			}
		}
		
		
	}
	
	
	

}
