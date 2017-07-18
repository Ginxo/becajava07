package com.everis.alicante.courses.becajava.garaje.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import com.everis.alicante.courses.becajava.garaje.GarajeMain;
import com.everis.alicante.courses.becajava.garaje.domain.Camion;
import com.everis.alicante.courses.becajava.garaje.domain.Cliente;
import com.everis.alicante.courses.becajava.garaje.domain.Coche;
import com.everis.alicante.courses.becajava.garaje.domain.Garaje;
import com.everis.alicante.courses.becajava.garaje.domain.Motocicleta;
import com.everis.alicante.courses.becajava.garaje.domain.Plaza;
import com.everis.alicante.courses.becajava.garaje.domain.Vehiculo;
import com.everis.alicante.courses.becajava.interfaces.Aparcable;
import com.everis.alicante.courses.becajava.interfaces.ControladorGaraje;

public class ControladorGarajeConArrays implements ControladorGaraje {

	@Override
	public void listarPlazasLibres() {
		
		List<Plaza> plazaslibres = new ArrayList<Plaza>();
		
		List<Plaza> plazas = GarajeMain.getGaraje().getPlazas();
		
		for (Plaza plaza : plazas) {
			if(plaza.getLibre()) {
				plazaslibres.add(plaza);
			}
		}
		
	}

	@Override
	public void listarPlazasOcupadas() {
		List<Plaza> plazaslibres = new ArrayList<Plaza>();
		
		List<Plaza> plazas=	GarajeMain.getGaraje().getPlazas();
		
		for (Plaza plaza : plazas) {
			
			if (plaza.getLibre()) {
				plazaslibres.add(plaza);
			}
		}
		for (Plaza plaza:plazaslibres) {
			System.out.println(plaza);
		}
		
	}
	

	@Override
	public boolean reservarPlaza() {
		
		Cliente cliente = new Cliente();		
		System.out.println("Inserte el nombre completo del Cliente");
		
		Scanner in = new Scanner(System.in);
		cliente.setNombreCompleto(in.nextLine());
		
		System.out.println("Inserte el nif del cliente");
		in = new Scanner(System.in);
		cliente.setNif(in.nextLine());		
		
		Vehiculo vehiculo = null;
		
		System.out.println("Tipo de vehiculo del propietario");
		System.out.println("1: Coche");
		System.out.println("2: Moto");
		System.out.println("3: Bici");
		
		in = new Scanner(System.in);
		
		switch (in.nextInt()) {
			case 1:
				vehiculo = new Coche();
				break;
			case 2:
				vehiculo = new Motocicleta();
				break;
			case 3:
				vehiculo = new Camion();
				break;
				
			default:
				break;
		}
		
	
		
		System.out.println("Inserte la matricula del vehiculo: ");
		in = new Scanner(System.in);
		vehiculo.setMatricula(in.nextLine());
		
		cliente.setVehiculo(vehiculo);
				
		boolean hayplaza=false;
		Garaje garaje = GarajeMain.getGaraje();
		
		List<Plaza> plazas = garaje.getPlazas();
		
		for (Plaza plaza: plazas) {
						
			if (plaza.getLibre() && vehiculo instanceof Aparcable) {		
				plaza.setCliente(cliente);
				hayplaza = true;
				return hayplaza;
			}
				
		//si hay plazas libres seteamos un cliente a la plaza que queramos
		}
		return hayplaza;
	}
}
