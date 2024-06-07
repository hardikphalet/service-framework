package org.trips.service_framework.utils;

import org.trips.service_framework.enums.UnitOfMeasurement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UomUtils {

    private static final BigDecimal LbsToKgConversionFactor = BigDecimal.valueOf(0.45359237);
    private static final BigDecimal KgToLbsConversionFactor = BigDecimal.valueOf(2.20462262);

    public static BigDecimal convertLbsToKg(BigDecimal quantity) {
        return quantity.multiply(LbsToKgConversionFactor).setScale(3, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal convertKgToLbs(BigDecimal quantity) {
        return quantity.multiply(KgToLbsConversionFactor).setScale(3, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal convertQuantity(UnitOfMeasurement inputUom, UnitOfMeasurement outputUom, BigDecimal quantity) {
        if (outputUom.equals(inputUom)) {
            return quantity;
        }
        if (outputUom.equals(UnitOfMeasurement.KG)) {
            return convertLbsToKg(quantity);
        }

        return convertKgToLbs(quantity);
    }
}
