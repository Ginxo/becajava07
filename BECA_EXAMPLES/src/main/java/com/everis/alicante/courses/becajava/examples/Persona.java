package com.everis.alicante.courses.becajava.examples;

public class Persona {
	
	private int edad;
	
	private Vehiculo vehiculo;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String hablar() {
		
		return "hablo desde persona";
		
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

}
