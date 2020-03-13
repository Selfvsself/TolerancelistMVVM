package com.selfvsself.tolerancelistmvvm.model.repository89;

public class ToleranceValue {

    private final int maxSize;
    private final double toleranceValue;
    private final String nameValue;

    public ToleranceValue(int maxSize, double toleranceValue, String nameValue) {
        this.maxSize = maxSize;
        this.toleranceValue = toleranceValue;
        this.nameValue = nameValue;
    }

    public double getToleranceValue() {
        return toleranceValue;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getNameValue() {
        return nameValue;
    }
}
