package com.everis.alicante.courses.becajava.examples;

public class Coche extends Vehiculo implements Aparcable {

	private double precio;
	
	@AnotacionMarcaCoche(marca="Ferrari")
	public String marca;
	
	@Override
	public void aparcar() {
		
		System.out.println("si que se aparcar");
		
	}

	@Override
	public void desaparcar() {
		
		System.out.println("si que se desaparcar");
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
}
