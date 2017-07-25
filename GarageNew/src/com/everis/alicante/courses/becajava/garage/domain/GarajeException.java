package com.everis.alicante.courses.becajava.garage.domain;

public class GarajeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6474336936597609781L;
	
	public void gestionaExcepcion() {
		
		System.out.println("Ha ocurrido una excepcion ; ");
		System.out.println("del tipo :" +super.getClass());		
		System.out.println(" y con esta causa: " + super.getCause());
		
	}
	

	public GarajeException(Exception e) {
		super.initCause(e);	
	}


	public String getMessage() {
		return super.getMessage();
	}


	public Throwable getCause() {
		return super.getCause();
	}


	

}
