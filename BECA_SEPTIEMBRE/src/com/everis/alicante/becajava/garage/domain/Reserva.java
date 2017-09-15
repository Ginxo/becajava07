package com.everis.alicante.becajava.garage.domain;

import java.util.Date;

public class Reserva {
	
	private Plaza plaza;
	
	private Cliente cliente;
	
	private Vehiculo vehiculo;
	
	private Date fechaReserva;

	public Plaza getPlaza() {
		return plaza;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Override
	public String toString() {
		return "Reserva [plaza=" + plaza + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaReserva="
				+ fechaReserva + "]";
	}
	
	
	

}
