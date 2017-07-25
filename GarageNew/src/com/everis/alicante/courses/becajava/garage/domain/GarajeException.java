package com.everis.alicante.courses.becajava.garage.domain;

import java.util.Calendar;

public class GarajeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6474336936597609781L;
	
	private Throwable causa;
	
	public void gestionaExcepcion() {
		
		System.out.println("Ha ocurrido una excepcion ; ");
		System.out.println("en la clase :" +super.getClass());		
		System.out.println(" y con esta causa: " + super.getCause());
		
	}
	

	public GarajeException(Exception e) {
		this.causa=e.getCause();	
	}


	public String getMessage() {
		return super.getMessage();
	}


	public Throwable getCause() {
		return this.causa;
	}


	public String adaptaFormatoTxt(){
		
		String tmp="";
		tmp=tmp.concat(Calendar.getInstance().getTime().toString());
		tmp=tmp.concat(";");
		tmp=tmp.concat(this.getClass().getSimpleName());
		tmp=tmp.concat(";");
		tmp=tmp.concat(getCause().toString());
		
		return tmp;
		
	}
	

}
