package com.everis.alicante.becajava.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@Table(name="booking")
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idbooking;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date bookingdate;

	//bi-directional many-to-one association to Client
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="idClient", nullable=false)
	private Client client;

	//bi-directional many-to-one association to Parkingplace
	@ManyToOne
	@JoinColumn(name="idParkingPlace", nullable=false)
	private Parkingplace parkingplace;

	//bi-directional many-to-one association to Vehicle
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="idVehicle", nullable=false)
	private Vehicle vehicle;

	public Booking() {
	}

	public int getIdbooking() {
		return this.idbooking;
	}

	public void setIdbooking(int idbooking) {
		this.idbooking = idbooking;
	}

	public Date getBookingdate() {
		return this.bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Parkingplace getParkingplace() {
		return this.parkingplace;
	}

	public void setParkingplace(Parkingplace parkingplace) {
		this.parkingplace = parkingplace;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}