package com.selfvsself.tolerancelistmvvm.model.repository89;

import com.selfvsself.tolerancelistmvvm.constant.TypeTolerance;

public class ToleranceValueWithBounds {

    private final TypeTolerance typeTolerance;
    private final ToleranceValue toleranceValue;
    private final String tolerance;
    private final double valueBound;

    public ToleranceValueWithBounds(TypeTolerance typeTolerance, ToleranceValue toleranceValue, double valueBound, String tolerance) {
        this.typeTolerance = typeTolerance;
        this.toleranceValue = toleranceValue;
        this.valueBound = valueBound;
        this.tolerance = tolerance;
    }

    public TypeTolerance getTypeTolerance() {
        return typeTolerance;
    }

    public ToleranceValue getToleranceValue() {
        return toleranceValue;
    }

    public double getValueBound() {
        return valueBound;
    }

    public String getTolerance() {
        return tolerance;
    }

    public double getUpBound() {
        double result = valueBound;
        return result;
    }

    public double getLowerBound() {
        double result = valueBound - toleranceValue.getToleranceValue();
        return result;
    }
}
