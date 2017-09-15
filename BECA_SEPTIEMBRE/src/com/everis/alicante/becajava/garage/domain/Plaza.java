package com.everis.alicante.becajava.garage.domain;

public class Plaza {
	
	
	private int numeroPlaza; 
	
	private double metrosCuadrados;
	
	private double precio;
	
	private Vehiculo vehiculo;
	
	public int getNumeroPlaza() {
		return numeroPlaza;
	}
	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Plaza [numeroPlaza=" + numeroPlaza + ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio
				+ ", vehiculo=" + vehiculo + "]";
	}
	
	

}
