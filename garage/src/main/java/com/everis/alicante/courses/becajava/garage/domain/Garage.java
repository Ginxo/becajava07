package com.everis.alicante.courses.becajava.garage.domain;

import com.everis.alicante.courses.becajava.garage.domain.parking.ParkingPlace;

/**
 * Created by emingora on 29/06/2017.
 */
public class Garage {

    private int carParkingPlacesMaxNumber = 30;
    private int motorcycleParkingPlacesMaxNumber = 10;
    private int bicycleParkingPlacesMaxNumber = 0;

    private ParkingPlace[] parkingPlaces = new ParkingPlace[carParkingPlacesMaxNumber + motorcycleParkingPlacesMaxNumber + bicycleParkingPlacesMaxNumber];


    public Garage() {

    }
}
