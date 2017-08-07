package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idclient;

	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=false, length=255)
	private String nif;

	@Column(nullable=false, length=255)
	private String surname;

	@Column(nullable=false, length=255)
	private String telephone;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="client", cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<Booking> bookings;

	//bi-directional many-to-one association to Vehicle
	@OneToMany(mappedBy="client", fetch=FetchType.EAGER ,cascade={CascadeType.ALL})
	private Set<Vehicle> vehicles;

	public Client() {
	}

	public int getIdclient() {
		return this.idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setClient(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setClient(null);

		return booking;
	}

	public Set<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		getVehicles().add(vehicle);
		vehicle.setClient(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setClient(null);

		return vehicle;
	}

}