package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the parkingplace database table.
 * 
 */
@Entity
@Table(name="parkingplace")
@NamedQuery(name="Parkingplace.findAll", query="SELECT p FROM Parkingplace p")
public class Parkingplace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idparkingplace;

	@Column(nullable=false)
	private int parkingnumber;

	@Column(nullable=false)
	private double parkingprize;

	@Column(nullable=false)
	private double parkingsize;

	@Column(nullable=false)
	private byte parkingstate;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="parkingplace", fetch=FetchType.EAGER)
	private Set<Booking> bookings;

	public Parkingplace() {
	}

	public int getIdparkingplace() {
		return this.idparkingplace;
	}

	public void setIdparkingplace(int idparkingplace) {
		this.idparkingplace = idparkingplace;
	}

	public int getParkingnumber() {
		return this.parkingnumber;
	}

	public void setParkingnumber(int parkingnumber) {
		this.parkingnumber = parkingnumber;
	}

	public double getParkingprize() {
		return this.parkingprize;
	}

	public void setParkingprize(double parkingprize) {
		this.parkingprize = parkingprize;
	}

	public double getParkingsize() {
		return this.parkingsize;
	}

	public void setParkingsize(double parkingsize) {
		this.parkingsize = parkingsize;
	}

	public byte getParkingstate() {
		return this.parkingstate;
	}

	public void setParkingstate(byte parkingstate) {
		this.parkingstate = parkingstate;
	}

	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setParkingplace(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setParkingplace(null);

		return booking;
	}

}