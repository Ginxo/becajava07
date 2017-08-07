package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the vehicle database table.
 * 
 */
@Entity
@Table(name="vehicle")
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idvehicle;

	@Column(nullable=false, length=255)
	private String vehiclemodel;

	@Column(nullable=false, length=255)
	private String vehicleplate;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="vehicle", fetch=FetchType.EAGER)
	private Set<Booking> bookings;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idCLIENT")
	private Client client;

	public Vehicle() {
	}

	public int getIdvehicle() {
		return this.idvehicle;
	}

	public void setIdvehicle(int idvehicle) {
		this.idvehicle = idvehicle;
	}

	public String getVehiclemodel() {
		return this.vehiclemodel;
	}

	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}

	public String getVehicleplate() {
		return this.vehicleplate;
	}

	public void setVehicleplate(String vehicleplate) {
		this.vehicleplate = vehicleplate;
	}

	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setVehicle(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setVehicle(null);

		return booking;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}