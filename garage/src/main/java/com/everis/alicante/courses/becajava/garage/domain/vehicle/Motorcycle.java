package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.CarBrandEnum;
import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.MotorCycleBrandEnum;

/**
 * Created by emingora on 29/06/2017.
 */
public abstract class Motorcycle implements MotorizedVehicle {

    abstract MotorCycleBrandEnum getMotorCycleBrand();


    Wheel[] wheels;

    Motorcycle() {
        this.wheels = new Wheel[]{new Wheel(), new Wheel()};
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }
}
