package com.everis.alicante.courses.becajava.garage.domain;

public class Cliente {
	
	private String nif;
	
	private String nombreCompleto;
	
	private Vehiculo vehiculo;

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String convierteAFormatoTxt(){
		
		String str="";
		
		str=str.concat(String.valueOf(this.nif));
		str=str.concat(";");
		str=str.concat(String.valueOf(this.nombreCompleto));
		str=str.concat(";");
		str=str.concat(this.getVehiculo().getMatricula());			
		
		
		return str;
	}
	
	

}
