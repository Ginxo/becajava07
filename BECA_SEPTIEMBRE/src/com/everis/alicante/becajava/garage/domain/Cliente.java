package com.everis.alicante.becajava.garage.domain;

public class Cliente {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Cliente() {
		super();
	}
	
	
	

}
