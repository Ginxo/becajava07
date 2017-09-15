package com.everis.alicante.becajava.garage.main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.becajava.garage.controller.GarageController;
import com.everis.alicante.becajava.garage.domain.Cliente;
import com.everis.alicante.becajava.garage.domain.Garaje;
import com.everis.alicante.becajava.garage.domain.Plaza;
import com.everis.alicante.becajava.garage.domain.PlazaCoche;
import com.everis.alicante.becajava.garage.domain.PlazaMoto;
import com.everis.alicante.becajava.garage.domain.Vehiculo;
import com.everis.alicante.becajava.garage.utilities.Lector;



public class GarageMain {

	public static Garaje garaje;	
	
	public static GarageController controller;
	
	public static void main(String[] args) throws IOException {
			
		inicializarComponentes();
		iniciarAplicacion();

	}
		
	private static void inicializarComponentes() throws IOException {
		
		garaje= new Garaje();
		controller=new GarageController();		
		Lector lector=new Lector();			
		garaje.setPlazas(lector.readPlazas());
		
	}

	public static void iniciarAplicacion() {
		
		System.out.println("*******************************************************");	
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion: ");
		System.out.println("1:Listar Plazas Garaje");	
		System.out.println("2:Reserva de plaza");	
				
		
		Scanner in = new Scanner(System.in);
		Integer opcion = in.nextInt();		
		
		System.out.println("Ha elegido la opcion :" + opcion);
		
		switch (opcion) {
		case 1:
			
			List<Plaza> plazas = controller.listarPlazas();
				
			for (Plaza plaza : plazas) {
				System.out.println(plaza);
			}
			
			
			break;
		case 2:
			
			//logica de recogida de datos
			Plaza plaza=new Plaza();
			Cliente cliente= new Cliente();
			Vehiculo vehiculo= new Vehiculo();
			
			plaza=recogeDatos(plaza,cliente,vehiculo);
			
			controller.reservaPlaza(plaza, cliente, vehiculo);
			
			break;

		default:
			break;
		}
		
		iniciarAplicacion();
	}

	private static Plaza recogeDatos(Plaza plaza,Cliente cliente,Vehiculo vehiculo) {
		
		System.out.println("Introduce nombre: ");
				
		Scanner in = new Scanner(System.in);
		String nombre = in.nextLine();		
		
		cliente.setNombre(nombre);
		
		System.out.println("Introduce vehiculo: ");
		
		in = new Scanner(System.in);
		String v = in.nextLine();		
		
		vehiculo.setModelo(v);
		
		System.out.println("Introduce plaza : ");
		
		in = new Scanner(System.in);
		int p = in.nextInt();		
		
		plaza = garaje.getPlazas().get(p-1); 
		
		return plaza;
		
	}

	

}
