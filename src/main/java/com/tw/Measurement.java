package com.tw;

import java.util.Objects;

public abstract class Measurement<Type extends Measurement<?>> {
    private final double magnitude;
    private final Unit unit;

    public Measurement(double value,Unit unit) {

        this.magnitude = value;
        this.unit = unit;
    }

    abstract static class Unit {
        private final double baseUnitFactor;

        public Unit(double baseUnitFactor) {
            this.baseUnitFactor = baseUnitFactor;
        }
        abstract Unit baseUnit();
    }
    abstract Type createMeasurement(double value, Unit unit);

    public double convertToUnit(Unit inputUnit) {
        return magnitude * (unit.baseUnitFactor / inputUnit.baseUnitFactor);
    }

    public Type plus(Type operand) {
        return createMeasurement(this.magnitude + operand.convertToUnit(this.unit),this.unit);

    }
    public Type minus(Type operand) {
        return createMeasurement(this.magnitude - operand.convertToUnit(this.unit),this.unit);

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Measurement)) return false;
        Measurement<?> that = (Measurement<?>) object;
        return this.convertToUnit(unit.baseUnit()) == that.convertToUnit(unit.baseUnit());

    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude,unit);
    }
}
