package com.everis.alicante.courses.becajava.garage.domain;

import java.util.Calendar;

public class GarajeException extends Exception{
	

	private static final long serialVersionUID = -8890393005500715068L;
	
	public Exception excepcionOrigen;
	
	public void gestionaExcepcion() {
		
		System.out.println("Ha ocurrido una excepcion ; ");
		System.out.println("del tipo :" + this.excepcionOrigen.getClass());		
		System.out.println("y por este motivo: " + this.excepcionOrigen.getLocalizedMessage());
		
	}
	

	public GarajeException(Exception e) {
		this.excepcionOrigen=e;
	}


	public String adaptaFormatoTxt(){
		
		String tmp="";
		tmp=tmp.concat(Calendar.getInstance().getTime().toString());
		tmp=tmp.concat(";");
		tmp=tmp.concat(this.excepcionOrigen.getClass().getSimpleName());
		tmp=tmp.concat(";");
		tmp=tmp.concat(this.excepcionOrigen.getLocalizedMessage());
		
		return tmp;
		
	}



}
