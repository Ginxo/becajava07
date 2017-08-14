package com.everis.beca.ws.rs;

import javax.ws.rs.Path;


public class Owner {

	private String name;
	
	public Owner(String name) {
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
