package com.everis.alicante.becajava.garage.domain;

public class Vehiculo {
		
	private String matricula;
	
	private String modelo;
	
	private Cliente cliente;
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", cliente=" + cliente + "]";
	}

	
	

	
	
}
