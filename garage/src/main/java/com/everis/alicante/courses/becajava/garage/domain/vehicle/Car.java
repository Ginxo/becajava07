package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.CarBrandEnum;

/**
 * Created by emingora on 29/06/2017.
 */
public abstract class Car implements MotorizedVehicle {

    abstract CarBrandEnum getCarBrand();

    Wheel[] wheels;

    Car() {
        this.wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }
}
