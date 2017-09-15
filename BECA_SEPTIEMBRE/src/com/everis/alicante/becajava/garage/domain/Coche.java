package com.everis.alicante.becajava.garage.domain;

public class Coche extends Vehiculo implements Aparcable{

	@Override
	public void aparcar() {
		
		System.out.println("se aparcar");
		
	}


	
}
