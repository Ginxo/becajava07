package com.everis.alicante.courses.becajava.examples;

public class Example {

	private String texto;
	
	public double numero;
	
	 String concatenaTextoYNumero(){
		return texto.concat(String.valueOf(numero));
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public Example() {
		super();
		this.numero=5;
		this.texto="text";
	}
	
	 
	 
}
