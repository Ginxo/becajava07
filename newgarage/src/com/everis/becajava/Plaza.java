package com.everis.becajava;

public class Plaza {
	
	private Cliente cliente;
	
	private double precio;
	
	private int numeroPlaza;
	
	private Boolean libre;
	
	
	public Boolean getLibre() {
		if (cliente == null) {
			return true;
		}else {
			return false;
		}
	}

	public int getNumeroPlaza() {
		return numeroPlaza;
	}
	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}

