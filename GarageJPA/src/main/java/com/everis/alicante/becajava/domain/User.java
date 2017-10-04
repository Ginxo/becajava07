package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="user")
@NamedQuery(query="Select u from User u where u.name = :name", name="findByName")
public class User implements Serializable {

	@Id	
	private int iduser;

	private String name;

	private String surname;

	
	public User() {
	}


	public int getIduser() {
		return iduser;
	}


	public void setIduser(int iduser) {
		this.iduser = iduser;
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

	

}