package com.everis.alicante.courses.becajava.examples;


public class Client extends Persona{


	private String name;

	private String nif;

	private String surname;

	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Client(String name, String nif, String surname, String telephone) {
		super();
		this.name = name;
		this.nif = nif;
		this.surname = surname;
		this.telephone = telephone;
	}

	public Client() {
		super();
	}

	@Override
	public String hablar() {
		
		return super.hablar()+" modificado";
	}

	public String hablar(String entrada) {
		
		return entrada;
	}

	public void comer() {
		
	}

	public Client(String name, String telephone) {
		super();
		this.name = name;
		this.telephone = telephone;
	}
	
	

	

}