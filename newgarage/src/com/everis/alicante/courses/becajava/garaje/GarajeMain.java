package com.everis.alicante.courses.becajava.garaje;

import java.io.IOException;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garaje.controller.ControladorGarajeImpl;
import com.everis.alicante.courses.becajava.garaje.domain.Garaje;
import com.everis.alicante.courses.becajava.garaje.interfaces.ClienteDAO;
import com.everis.alicante.courses.becajava.garaje.interfaces.PlazaDAO;
import com.everis.alicante.courses.becajava.garaje.interfaces.ReservaDAO;
import com.everis.alicante.courses.becajava.garaje.interfaces.implementacion.ClienteDAOFileImpl;
import com.everis.alicante.courses.becajava.garaje.interfaces.implementacion.PlazaDAOFileImpl;
import com.everis.alicante.courses.becajava.garaje.interfaces.implementacion.ReservaDAOFileImpl;

public class GarajeMain {

		static Garaje garaje;
		
		static ControladorGarajeImpl controlador;
		
		
		public static void main(String[] args) throws IOException {	
		
		
			inicializarComponentes();
		
		//iniciar aplicacion o listar menu
		
			iniciarAplicacion();

	}
	
	private static void iniciarAplicacion() throws IOException {
		
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion: ");
		System.out.println("1:Listar Plazas Garaje Libre ");
		System.out.println("2:Listar Plazas Garaje Ocupadas ");
		System.out.println("3:Reservar Plazas");
		System.out.println("4:Listar Clientes");
		
		Scanner in = new Scanner(System.in);
		Integer opcion = in.nextInt();
	    boolean resultado = true;   
		
		System.out.println("Ha elegido la opcion :" + opcion);
				
		switch (opcion) {
			case 1:	
				controlador.listarPlazasLibres();			
				break;
			case 2:			
				controlador.listarPlazasOcupadas();			
				break;
			case 3:			
				resultado=controlador.reservarPlaza();			
				break;
			case 4:			
				controlador.listarClientes();		
				break;
			default:
				System.out.println("Error");
				break;
			}
		
		
		if(opcion==3&&resultado){
			System.out.println("Se ha reservado su plaza");
		}else if (opcion==3){
			System.out.println("No hay plazas disponibles");
		}
			
		iniciarAplicacion();
		
	}

	public static void inicializarComponentes() throws IOException{
		
		garaje= new Garaje();		
		  
		PlazaDAO plazaDao= new PlazaDAOFileImpl();	
		ReservaDAO reservaDao= new ReservaDAOFileImpl();
		ClienteDAO clienteDao= new ClienteDAOFileImpl();
		
		garaje.setPlazas(plazaDao.readPlazas());
		
//		garaje.setReservas(reservaDao.readReservas());
		
		garaje.setClientes(clienteDao.readClientes());
		
		controlador= new ControladorGarajeImpl();
		
	}

	public static Garaje getGaraje() {
		return garaje;
	}
	
	
}