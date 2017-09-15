package com.everis.alicante.becajava.garage.controller;

import java.util.List;

import com.everis.alicante.becajava.garage.domain.Cliente;
import com.everis.alicante.becajava.garage.domain.Plaza;
import com.everis.alicante.becajava.garage.domain.Vehiculo;
import com.everis.alicante.becajava.garage.main.GarageMain;

public class GarageController {
	
	
	public List<Plaza> listarPlazas(){		
		
		return GarageMain.garaje.getPlazas();			
		
	}
	
	
	public void reservaPlaza(Plaza plaza,Cliente cliente,Vehiculo vehiculo){		
			
		vehiculo.setCliente(cliente);
		plaza.setVehiculo(vehiculo);
		
	}


}
