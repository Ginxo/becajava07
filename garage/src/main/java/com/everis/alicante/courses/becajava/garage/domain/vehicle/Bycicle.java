package com.everis.alicante.courses.becajava.garage.domain.vehicle;

public abstract class Bycicle implements Vehicle {
    Wheel[] wheels;

    Bycicle() {
        this.wheels = new Wheel[]{new Wheel(), new Wheel()};
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }
}
