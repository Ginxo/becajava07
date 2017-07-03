package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.EngineKindEnum;

/**
 * Created by emingora on 29/06/2017.
 */
public interface MotorizedVehicle extends Vehicle {
    EngineKindEnum getEngineKind();
}
