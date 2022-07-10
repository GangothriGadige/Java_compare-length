package com.tw;

public class Weight extends Measurement<Weight> {

    private Weight(double magnitude, Unit unit) {
        super(magnitude, unit);

    }

    private static class WeightUnit extends Unit {
        private final static WeightUnit gram = new WeightUnit(0.001);
        private final static WeightUnit kilogram = new WeightUnit(1);
        public WeightUnit(double baseUnitFactor) {
            super(baseUnitFactor);
        }

        @Override
        Unit baseUnit() {
            return kilogram;
        }
    }
    public static Weight gram(double magnitude) {
        return new Weight(magnitude, WeightUnit.gram);
    }

    public static Weight kilogram(double magnitude) {
        return new Weight(magnitude, WeightUnit.kilogram);
    }

    @Override
    Weight createMeasurement(double magnitude, Unit unit) {
        return new Weight(magnitude, unit);
    }
}


