package com.everis.beca.spring.boot.garageboot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car implements Comparable<Car> {

	private String matricula;
	private String color;
	
	public Car(String matricula, String color) {
		this.matricula = matricula;
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public int compareTo(Car otherCar) {
		
		return this.matricula.compareTo(otherCar.getMatricula());
	}
	
}
