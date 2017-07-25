package com.everis.alicante.courses.becajava.garage.domain.client;

/**
 * Created by emingora on 29/06/2017.
 */
public class Client {
    private String dni;
    private String name;
    private String surname;
    private String birthDate;

    public Client(String dni, String name, String surname, String birthDate) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return dni + ";" + name + ";" + surname + ";" + birthDate;
	}
	
	
    
    
    
}
