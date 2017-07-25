package com.everis.alicante.courses.becajava.garage.domain.booking;

import com.everis.alicante.courses.becajava.garage.domain.client.Client;
import com.everis.alicante.courses.becajava.garage.domain.vehicle.Vehicle;

import java.util.Date;

/**
 * The type Booking.
 */
public class Booking {

    private Date bookindDate;
    private Client client;
    private Vehicle vehicle;
    private String description;

    /**
     * Instantiates a new Booking.
     *
     * @param client      the client
     * @param vehicle     the vehicle
     * @param description the description
     */
    public Booking(Client client, Vehicle vehicle, String description) {
        this.bookindDate = new Date();
        this.client = client;
        this.vehicle = vehicle;
        this.description = description;
    }
}
