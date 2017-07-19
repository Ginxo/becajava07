package com.everis.alicante.courses.becajava.garaje.domain;

import java.util.Date;

public class Reserva {
	
	private Cliente cliente;
	
	private Plaza plaza;
	
	private Date fechaReserva;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Plaza getPlaza() {
		return plaza;
	}


	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}


	public Date getFechaReserva() {
		return fechaReserva;
	}


	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String convierteAFormatoTxt() {
	
		String str="";
		
		str=str.concat(String.valueOf(this.plaza.getNumeroPlaza()));
		str=str.concat(";");
		str=str.concat(this.cliente.getNif());
		str=str.concat(";");
		str=str.concat(this.cliente.getVehiculo().getMatricula());
		str=str.concat(";");
		str=str.concat(this.fechaReserva.toString());
		
		
		return str;
	}
}