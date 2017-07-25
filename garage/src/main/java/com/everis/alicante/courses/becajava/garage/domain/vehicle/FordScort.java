package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.CarBrandEnum;
import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.EngineKindEnum;

/**
 * The type Ford scort.
 */
public class FordScort extends Car {

    public EngineKindEnum getEngineKind() {
        return EngineKindEnum.OIL;
    }


    public CarBrandEnum getCarBrand() {
        return CarBrandEnum.FORD;
    }
}
