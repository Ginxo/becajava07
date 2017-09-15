package com.everis.alicante.becajava.garage.domain;

public class Moto extends Vehiculo implements Aparcable{

	@Override
	public void aparcar() {
		
		System.out.println("Si que se aparcar");
		
	}
}
