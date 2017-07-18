package com.everis.alicante.courses.becajava.garage.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.GarageMain;
import com.everis.alicante.courses.becajava.garage.domain.Camion;
import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.Coche;
import com.everis.alicante.courses.becajava.garage.domain.Garaje;
import com.everis.alicante.courses.becajava.garage.domain.Motocicleta;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garage.interfaces.Aparcable;
import com.everis.alicante.courses.becajava.garage.interfaces.ControladorGaraje;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAOFileImp;

public class ControladorGarajeConArrays implements ControladorGaraje{

	@Override
	public void listarPlazasLibres() {
		
		List<Plaza> plazaslibres= new ArrayList<Plaza>();
		
		List<Plaza> plazas=GarageMain.getGaraje().getPlazas();
		
		for (Plaza plaza : plazas) {
			
			if(plaza.getLibre()){
				plazaslibres.add(plaza);			
			}		
		
		}
		
		//listar por pantalla
		for (Plaza plaza1 : plazaslibres) {			
				System.out.println(plaza1);			
			}
		
		}


	@Override
	public void listarPlazasOcupadas() {
		
		List<Plaza> plazasOcupadas= new ArrayList<Plaza>();
		
		List<Plaza> plazas=GarageMain.getGaraje().getPlazas();
		
		for (Plaza plaza : plazas) {
			
			if(!plaza.getLibre()){
				plazasOcupadas.add(plaza);	
			}		
		
		}
		
		//listar por pantalla
		for (Plaza plaza1 : plazasOcupadas) {			
				System.out.println(plaza1);			
			}
		
		
	}

	@Override
	public boolean reservarPlaza() throws IOException {
		
		//logica de crear cliente
		
		Cliente cliente= new Cliente();
		
		ReservaDAO dao= new ReservaDAOFileImp();
		
		//vamos a escribir por pantalla un menu para meter los datos del cliente
		
		System.out.println("Inserte el nombre completo del Cliente");
		
		Scanner in = new Scanner(System.in);		
		cliente.setNombreCompleto(in.nextLine());
		
		System.out.println("Insert el nif del cliente");		
		in = new Scanner(System.in);
		cliente.setNif(in.nextLine());
		
		Vehiculo vehiculo = null;
		
		System.out.println("Tipo de vehiculo del propietario:");	
		System.out.println("1: Coche:");	
		System.out.println("2: Moto");	
		System.out.println("3: Camion");
		
		in = new Scanner(System.in);
		
		
		switch (in.nextInt()) {
			case 1:
				 vehiculo= new Coche();
				break;
			case 2:
				 vehiculo= new Motocicleta();
				break;
			case 3:
				vehiculo= new Camion();
				break;
	
			default:
				break;
		}
		
		System.out.println("Inserte la matricula del vehiculo:");
		in = new Scanner(System.in);
		vehiculo.setMatricula(in.nextLine());
				
		cliente.setVehiculo(vehiculo);
		
		boolean hayplaza=false;
		Garaje garaje=GarageMain.getGaraje();		
		List<Plaza> plazas=garaje.getPlazas();
		
		for (Plaza plaza : plazas) {
			
			if (plaza.getLibre()&&vehiculo instanceof Aparcable) {				
				plaza.setCliente(cliente);				
				hayplaza=true;
				
				Reserva reserva= new Reserva();
				reserva.setCliente(cliente);
				reserva.setPlaza(plaza);
				reserva.setFechaReserva(Calendar.getInstance().getTime());
				
				dao.saveReserva(reserva);				
				
				return hayplaza;
			}		
		}
				
		return hayplaza;
		
	}

}
