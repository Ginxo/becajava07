package com.everis.alicante.courses.becajava.garage.domain;

import java.util.Date;

public class Reserva {
	
	private String codigoReserva;
	
	private Cliente cliente;
	
	private Plaza plaza;
	
	private Date fechaReserva;
	
	private Date fechaInicio;
	
	private Date fechaFin;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	
	public String getCodigoReserva() {
			
		return codigoReserva;
	}

	public String convierteAFormatoTxt(){
		
		String str="";
		
		str=str.concat(String.valueOf(this.getCodigoReserva()));
		str=str.concat(";");
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
