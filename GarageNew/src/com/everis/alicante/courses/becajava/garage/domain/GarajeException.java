package com.everis.alicante.courses.becajava.garage.domain;

import java.util.Calendar;

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


	public String adaptaFormatoTxt(){
		
		String tmp="";
		tmp=tmp.concat(Calendar.getInstance().getTime().toString());
		tmp=tmp.concat(";");
		tmp=tmp.concat(this.getClass().getSimpleName());
		tmp=tmp.concat(";");
		tmp=tmp.concat(this.getCause().toString());
		
		return tmp;
		
	}
	

}
