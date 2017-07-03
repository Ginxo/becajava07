package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.CarBrandEnum;
import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.EngineKindEnum;

/**
 * The type Nissan qashqai.
 */
public class NissanQashqai extends Car {

    public EngineKindEnum getEngineKind() {
        return EngineKindEnum.DIESEL;
    }

    public CarBrandEnum getCarBrand() {
        return CarBrandEnum.NISSAN;
    }
}
