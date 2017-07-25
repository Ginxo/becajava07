package com.everis.alicante.courses.becajava.garaje.domain;

public class GarajeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6474336936597609781L;
	
	@SuppressWarnings("unused")
	private Throwable causa;
	
	public void gestionaExcepcion() {
		
		System.out.println("Ha ocurrido una excepcion ; ");
		System.out.println("del tipo :" +super.getClass());		
		System.out.println(" y con esta causa: " + super.getCause());
		
	}
	

	public GarajeException(Exception e) {
		this.causa=getCause();	
	}


	public String getMessage() {
		return super.getMessage();
	}


	public Throwable getCause() {
		return super.getCause();
	}


	

}