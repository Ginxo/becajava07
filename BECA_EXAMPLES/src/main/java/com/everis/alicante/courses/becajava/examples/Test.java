package com.everis.alicante.courses.becajava.examples;

import com.everis.alicante.courses.becajava.garage.domain.Garage;
import com.everis.alicante.courses.becajava.garage.domain.client.Client;

public class Test {

	public static void main(String[] args) {
		
		
		Garage garaje= new Garage();

//		System.out.println(garaje.getCarParkingPlacesMaxNumber());
		
		Client cliente1=new Client("48678876","Jose","Jimenez","13021983");
		Client cliente2=new Client("456456456","Pepe","Perez","13021983");
		System.out.println(cliente2);
		Client cliente3=new Client("456456456","Pepe","Perez","13021983");
		System.out.println(cliente3);
		
//		System.out.println(cliente.getDni());
		
//		System.out.println(cliente1.toString());
		
		System.out.println(cliente2.equals(cliente3));
		
		
		Coche coche= new Coche();
				
		coche.lavar();
		
		coche.getPrecio();
		
		Vehiculo vehiculo= new Vehiculo();
		
		((Coche)(vehiculo)).getPrecio();
		
		((Aparcable)(vehiculo)).aparcar();
		
	}

}
