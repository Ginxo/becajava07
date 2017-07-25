package com.everis.alicante.courses.becajava.garage.domain.vehicle;

import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.EngineKindEnum;
import com.everis.alicante.courses.becajava.garage.domain.vehicle.enumerator.MotorCycleBrandEnum;

/**
 * The type Ducati monster.
 */
public class DucatiMonster extends Motorcycle {
    public EngineKindEnum getEngineKind() {
        return EngineKindEnum.DIESEL;
    }

    MotorCycleBrandEnum getMotorCycleBrand() {
        return MotorCycleBrandEnum.DUCATI;
    }
}
