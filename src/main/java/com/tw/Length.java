package com.tw;

import java.util.Objects;

public class Length extends Measurement<Length> {

    private Length(double magnitude, Unit unit) {
        super(magnitude, unit);
    }


    private static class LengthUnit extends Unit {
        private final static LengthUnit meter = new LengthUnit(1);
        private final static LengthUnit centimeter = new LengthUnit(0.01);
        private final static LengthUnit kilometer = new LengthUnit(1000);


        public LengthUnit(double baseUnitFactor) {
            super(baseUnitFactor);
        }

        @Override
        Unit baseUnit() {
            return meter;
        }
    }

    public static Length meter(double magnitude) {
        return new Length(magnitude, LengthUnit.meter);
    }

    public static Length centimeter(double magnitude) {

        return new Length(magnitude, LengthUnit.centimeter);
    }

    public static Length kilometer(double magnitude) {

        return new Length(magnitude, LengthUnit.kilometer);
    }

    @Override
    Length createMeasurement(double magnitude, Unit unit) {
        return new Length(magnitude, unit);
    }


}




