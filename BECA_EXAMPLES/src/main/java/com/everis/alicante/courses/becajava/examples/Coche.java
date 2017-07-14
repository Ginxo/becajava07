package com.everis.alicante.courses.becajava.examples;

public class Coche extends Vehiculo implements Aparcable {

	@Override
	public void aparcar() {
		
		System.out.println("si que se aparcar");
		
	}

	@Override
	public void desaparcar() {
		
		System.out.println("si que se desaparcar");
	}

	
	
}
