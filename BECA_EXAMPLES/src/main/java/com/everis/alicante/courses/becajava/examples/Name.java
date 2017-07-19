package com.everis.alicante.courses.becajava.examples;

public class Name implements Comparable<Name> {
	
	private String name;
	private String surname;
	
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
	public Name(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Name [name=" + name + ", surname=" + surname + "]";
	}
	
	

}
