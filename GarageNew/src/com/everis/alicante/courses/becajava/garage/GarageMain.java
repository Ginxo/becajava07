package com.everis.alicante.courses.becajava.garage;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.controller.ControladorGarajeConArrays;
import com.everis.alicante.courses.becajava.garage.domain.Garaje;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.interfaces.ControladorGaraje;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAOFileImp;

public class GarageMain {

		static Garaje garaje;
		
		static ControladorGaraje controlador;
		
		
		public static void main(String[] args) throws IOException {	
		
		
			inicializarComponentes();
		
		//iniciar aplicacion o listar menu
		
			iniciarAplicacion();

	}
	
	private static void iniciarAplicacion() throws IOException {
		
		System.out.println("Bienvenido a nuestro garaje, seleccione una opcion: ");
		System.out.println("1:Listar Plazas Garaje Libre ");
		System.out.println("2:Listar Plazas Garaje Ocupadas ");
		System.out.println("3:Reservar Plazas");
		
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
		  
		PlazaDAO plazaDao= new PlazaDAOFileImp();			  
	    
//		Plaza[] plazas= plazaDao.readPlazas(),;		

		List<Plaza> plazasTemp= plazaDao.readPlazas();
		
		garaje.setPlazas(plazasTemp);
		
		controlador= new ControladorGarajeConArrays();
		
		//controlador= new ControladorGarajeConColecciones();
		
	}

	public static Garaje getGaraje() {
		return garaje;
	}
	
	
}
