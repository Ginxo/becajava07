package com.everis.alicante.courses.becajava.garage.domain.parking;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.Vehicle;

public class ParkingPlace {
    private int number;
    private Class<Vehicle> vehicleClass;

    public ParkingPlace(int number, Class<Vehicle> vehicleClass) {
        this.number = number;
        this.vehicleClass = vehicleClass;
    }
}
