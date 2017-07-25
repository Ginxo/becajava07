package com.everis.alicante.courses.becajava.garage.controller;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.domain.Camion;
import com.everis.alicante.courses.becajava.garage.domain.Cliente;
import com.everis.alicante.courses.becajava.garage.domain.Coche;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;
import com.everis.alicante.courses.becajava.garage.domain.Motocicleta;
import com.everis.alicante.courses.becajava.garage.domain.Plaza;
import com.everis.alicante.courses.becajava.garage.domain.Reserva;
import com.everis.alicante.courses.becajava.garage.domain.Vehiculo;
import com.everis.alicante.courses.becajava.garage.interfaces.Aparcable;
import com.everis.alicante.courses.becajava.garage.interfaces.ClienteDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.PlazaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.ReservaDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.VehiculoDAO;
import com.everis.alicante.courses.becajava.garage.interfaces.implementation.ClienteDAOFileImpl;
import com.everis.alicante.courses.becajava.garage.interfaces.implementation.PlazaDAOFileImp;
import com.everis.alicante.courses.becajava.garage.interfaces.implementation.ReservaDAOFileImp;
import com.everis.alicante.courses.becajava.garage.interfaces.implementation.VehiculoDAOFileImpl;
import com.everis.alicante.courses.becajava.garage.utils.ValidadorNIF;

public class ControladorGarajeImpl implements ControladorGaraje{

	@Override
	public Map<Integer,Plaza> listarPlazasLibres() throws GarajeException {
		
		Map<Integer, Plaza> plazasTotales = null;
		
		
		try {
			
			PlazaDAO plazaDao= new PlazaDAOFileImp();
			
			plazasTotales = plazaDao.readPlazas();			
			
			ReservaDAO reservaDAO= new ReservaDAOFileImp();
			
			Collection<Reserva> reservas = reservaDAO.readReservas().values();	
			
			for (Reserva reserva : reservas) {
				
				plazasTotales.remove(Integer.parseInt(reserva.getCodigoReserva()));
				
			}
			
			throw new IOException();	
			
			
		} catch (Exception e) {
			
			GarajeException ex= new GarajeException(e);			
			
			throw ex;
			
		}
		
	}

	@Override
	public void listarPlazasOcupadas() throws IOException, ParseException {		
				
		ReservaDAO reservaDAO= new ReservaDAOFileImp();
		
		Collection<Reserva> reservas = reservaDAO.readReservas().values();			
				
		System.out.println("PLAZAS OCUPADAS: ");
		
		for (Reserva reserva : reservas) {
			
			System.out.println("La plaza numero: " + reserva.getCodigoReserva()+" esta reservada");
			
		}
		
	}
	
	@Override
	public boolean reservarPlaza() throws IOException, ParseException, GarajeException {
		
		//logica de crear cliente
		
		Cliente cliente= new Cliente();
		
		ReservaDAO daoReserva= new ReservaDAOFileImp();
		ClienteDAO daoCliente=new ClienteDAOFileImpl();
		VehiculoDAO daoVehiculo=new VehiculoDAOFileImpl();
		
		//vamos a escribir por pantalla un menu para meter los datos del cliente
		
		System.out.println("Inserte el nombre completo del Cliente");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);		
		cliente.setNombreCompleto(in.nextLine());
		
		boolean nifCorrecto=false;			
		String nif="";	
		
		while(!nifCorrecto){
			System.out.println("Inserte el nif del cliente");	
			in = new Scanner(System.in);
			nif=in.nextLine();
			nifCorrecto=ValidadorNIF.validaNif(nif);	
			if(nifCorrecto==false){
				System.out.println("NIF INCORRECTO");
			}
		}
		cliente.setNif(nif);
		
		Vehiculo vehiculo = null;
		
		System.out.println("Tipo de vehiculo del propietario:");	
		System.out.println("1: Coche:");	
		System.out.println("2: Motocicleta");	
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
		vehiculo.setTipoVehiculo(vehiculo.getClass().getSimpleName());
						
		cliente.setVehiculo(vehiculo);
		
		boolean hayplaza=false;							
	
		Map<Integer, Plaza> plazas = listarPlazasLibres();		
				
		for (Plaza plaza : plazas.values()) {
			
			if (vehiculo instanceof Aparcable) {				
								
				hayplaza=true;
				
				Reserva reserva= new Reserva();
				reserva.setCliente(cliente);
				reserva.setPlaza(plaza);
				reserva.setFechaReserva(Calendar.getInstance().getTime());
				reserva.setCodigoReserva(String.valueOf(plaza.getNumeroPlaza()));
				
				daoReserva.createReserva(reserva);		
				
				daoCliente.createCliente(cliente);
				
				daoVehiculo.createVehiculo(vehiculo);
				
				return hayplaza;
			}		
		}
				
		return hayplaza;
		
	}
	
	@Override
	public void listarClientes() throws IOException {
		
		ClienteDAO daoCliente= new ClienteDAOFileImpl();		
		
		Map<String, Cliente> clientes = daoCliente.readClientes();;
				
		Collection<Cliente> collection = clientes.values();
		
		for (Iterator<Cliente> iterator = collection.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			
			System.out.println(cliente.getNombreCompleto()+";" + cliente.getNif());			
					
		}
		

	}
	
	@Override
	public void listarReservas() throws IOException, ParseException {
	
		
		ReservaDAO reservaDao= new ReservaDAOFileImp();
		
		Map<String, Reserva> reservas = reservaDao.readReservas();
		
		 Collection<Reserva> listaReservas = reservas.values();
		 
		 for (Reserva reserva : listaReservas) {
			 
			 System.out.println("numero de plaza reservada: " +reserva.getPlaza().getNumeroPlaza());
			 System.out.println("cliente: " +reserva.getCliente().getNombreCompleto());
			 System.out.println("vehiculo: " +reserva.getCliente().getVehiculo().getMatricula() +" - " + reserva.getCliente().getVehiculo().getTipoVehiculo());
			
		}
		
	}
	
	@Override
	public void listarVehiculos() throws IOException {
		
		VehiculoDAO daoVehiculo= new VehiculoDAOFileImpl();
	
		Collection<Vehiculo> vehiculos = daoVehiculo.readVehiculos().values();
		
		for (Vehiculo vehiculo : vehiculos) {
			
			System.out.println(vehiculo.getMatricula()+"-" + vehiculo.getTipoVehiculo());
			
		}
		
	}


	@Override
	public void listarReservasByFecha(Date fechaInicio, Date fechaFin) throws IOException, ParseException {
	
		ReservaDAO reservaDAO= new ReservaDAOFileImp();
		
		Map<String, Reserva> reservas = reservaDAO.readReservas();
		
		for (Reserva reserva : reservas.values()) {
			
			if(reserva.getFechaReserva().before(fechaFin)&&
					
			   reserva.getFechaReserva().after(fechaInicio)){
				
				System.out.println("Reserva: "+reserva);
				
			}
			
		}
		
		
	}

}
