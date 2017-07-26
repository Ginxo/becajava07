package com.everis.alicante.courses.becajava.garage.domain;
import com.everis.alicante.courses.becajava.garage.interfaces.Aparcable;

public class Motocicleta extends Vehiculo implements Aparcable{
	
	private String marca;


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public void aparcar() {
		System.out.println("puedo aparcar");
		
	}
	
	

}
