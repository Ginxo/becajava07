package com.everis.alicante.courses.becajava.garage.domain;
public class Plaza {
	
	private Cliente cliente;
	
	private double precio;
	
	private int numeroPlaza;
	
		
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


	public int getNumeroPlaza() {
		return numeroPlaza;
	}


	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}


	public Boolean getLibre() {
		
		if (cliente==null) {
			return true;
		}
		else{
			return false;
		}
	}


	@Override
	public String toString() {
		return "Plaza [cliente=" + cliente + ", precio=" + precio + ", numeroPlaza=" + numeroPlaza + "]";
	}


	
	
	
	

}
