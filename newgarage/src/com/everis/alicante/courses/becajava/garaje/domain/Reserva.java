package com.everis.alicante.courses.becajava.garaje.domain;

public class Reserva {
	private Cliente cliente;
	
	private Plaza plaza;
	
	private Vehiculo vehiculo;
	
	private fechaReserva ;
	
	Private 
	
}

public String convierteAFormatoTxt() {
	
		String str="";
		
		str=str.concat(String.valueOf(this.plaza.getNumeroPlaza()));
		str=str.concat(";");
		str=str.concat(this.cliente.getNif());
		str=str.concat(";");
		str=str.concat(this.vehiculo.getMatricula());
		str=str.concat(";");
		str=str.concat(this.fechaReserva.toString());
}