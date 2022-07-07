package com.tw;

import java.util.Objects;

public class Length {
    private final double magnitude;
    private final Unit unit;

        public Length plus(Length lengthToBeConverted) {
            return new Length(magnitude + lengthToBeConverted.convertToUnit(unit), unit);
        }


    private static class Unit {

        final static Unit meter = new Unit(1);
        final static Unit centimeter = new Unit(0.01);
        final static Unit kilometer = new Unit(1000);

        private final double baseUnitFactor;


        public Unit(double baseUnitFactor) {
            this.baseUnitFactor = baseUnitFactor;
        }
    }


    public static Length meter(double magnitude) {
        return new Length(magnitude, Unit.meter);
    }

    public static Length centimeter(double magnitude) {
        return new Length(magnitude, Unit.centimeter);
    }

    public static Length kilometer(double magnitude) {
        return new Length(magnitude, Unit.kilometer);
    }


    public double convertToUnit(Unit inputUnit) {
        return magnitude * (unit.baseUnitFactor / inputUnit.baseUnitFactor);
    }

    private Length(double value, Unit unit) {
        this.magnitude = value;
        this.unit = unit;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Length that = (Length) object;
        return this.convertToUnit(Unit.meter) == that.convertToUnit(Unit.meter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude);
    }


}


