package org.trips.service_framework.enums;

import lombok.Getter;

public enum UnitOfMeasurement {
    KG("kg"),
    LB("lb"),
    CANS("cans");

    @Getter
    private final String name;

    UnitOfMeasurement(String name) {
        this.name = name;
    }
}
