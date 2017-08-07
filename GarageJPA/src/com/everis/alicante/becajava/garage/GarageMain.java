package com.everis.alicante.becajava.garage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Vehicle;
import com.everis.alicante.becajava.garage.controller.ControladorGaraje;
import com.everis.alicante.becajava.garage.controller.ControladorGarajeImpl;

public class GarageMain {
	
		static Logger log=Logger.getLogger(GarageMain.class);	

		static ControladorGaraje controlador;		
		
		static Date fechaInicio = null;
		
		static Date fechaFin=null;
		
		public static void main(String[] args) {	
		
		
			inicializarComponentes();
		
		//iniciar aplicacion o listar menu
		
			iniciarAplicacion();

	}
	
	@SuppressWarnings("resource")
	public static void iniciarAplicacion() {
		
		System.out.println("*******************************************************");	
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion: ");
		System.out.println("1:Listar Plazas Garaje Libre ");
		System.out.println("2:Listar Plazas Garaje Ocupadas ");
		System.out.println("3:Reservar Plazas");
		System.out.println("4:Listar Clientes");
		System.out.println("5:Listar Reservas");
		System.out.println("6:Listar Vehiculos");
		System.out.println("7:Listar por Fecha de Reserva");
		
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
					booking();			
					break;
				case 4:			
					controlador.listarClientes();		
					break;
				case 5:			
					controlador.listarReservas();		
					break;
				case 6:			
					controlador.listarVehiculos();		
					break;
				case 7:	
					validarFechasEntrada();
					controlador.listarReservasByFecha(fechaInicio, fechaFin);		
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

	public static void inicializarComponentes(){	
	
		controlador= new ControladorGarajeImpl();	
		
	}

	
	public static void booking(){
		
		System.out.println("Inserte el nombr del Cliente");
		
		Client client= new Client();			
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);		
		client.setName(in.nextLine());
	
		System.out.println("Inserte los apellidos del Cliente");

		in = new Scanner(System.in);		
		client.setSurname(in.nextLine());		
		
		System.out.println("Inserte el nif del cliente");	
		in = new Scanner(System.in);
		client.setNif(in.nextLine());
		
		System.out.println("Inserte el numero de telefono del cliente");	
		in = new Scanner(System.in);
		client.setTelephone(in.nextLine());
		
		Vehicle vehicle = new Vehicle();
		
		System.out.println("Tipo de vehiculo del propietario:");	
		System.out.println("1: Coche:");	
		System.out.println("2: Motocicleta");	
		System.out.println("3: Camion");
		
		in = new Scanner(System.in);		
		
		switch (in.nextInt()) {
			case 1:
				 vehicle.setVehiclemodel("Car");
				break;
			case 2:
				 vehicle.setVehiclemodel("Motorbike");
				break;
			case 3:
				vehicle.setVehiclemodel("Trailer");
				break;
	
			default:
				break;
		}
		
		System.out.println("Inserte la matricula del vehiculo:");
		in = new Scanner(System.in);
		vehicle.setVehicleplate(in.nextLine());
		
		vehicle.setClient(client);
		
		Set<Vehicle> vehicles= new HashSet<Vehicle>();
		vehicles.add(vehicle);
		client.setVehicles(vehicles);		
						
		controlador.reservarPlaza(client, vehicle);		
		
	}

	public static void validarFechasEntrada(){
		
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		
		if(fechaInicio==null){
		
			System.out.println("Introduce la fecha de Inicio para la busqueda en formato dd/MM/yyyy: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			String tmp=in.nextLine();		
			
			try {			
				fechaInicio=formatter.parse(tmp);	
				
				System.out.println("Introduce la fecha de Fin para la busqueda en formato dd/MM/yyyy: ");
				in = new Scanner(System.in);
				tmp=in.nextLine();
				
				fechaFin=formatter.parse(tmp);
				
			} catch (Exception e) {
				
				System.out.println("La fecha introducida es incorrecta");
				validarFechasEntrada();
			}
		}
		else if(fechaFin==null){
			
			System.out.println("Introduce la fecha de Fin para la busqueda en formato dd/MM/yyyy: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			String tmp = in.nextLine();
			
			try {
				
				fechaFin=formatter.parse(tmp);
				
			} catch (ParseException e) {	
				
				System.out.println("La fecha introducida es incorrecta");
				validarFechasEntrada();
				
			}
			
			
		}
		
	}
	
	
}
