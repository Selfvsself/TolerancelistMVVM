package com.selfvsself.tolerancelistmvvm.model;

import com.selfvsself.tolerancelistmvvm.constant.Tolerance;

public class ListItem {

    private double size;
    private Tolerance tolerance;
    private double upperTolerance;
    private double lowerTolerance;

    public ListItem(double size, Tolerance tolerance, double upperTolerance, double lowerTolerance) {
        this.size = size;
        this.tolerance = tolerance;
        this.upperTolerance = upperTolerance;
        this.lowerTolerance = lowerTolerance;
    }

    public double getSize() {
        return size;
    }

    public Tolerance getTolerance() {
        return tolerance;
    }

    public double getUpperTolerance() {
        return upperTolerance;
    }

    public double getLowerTolerance() {
        return lowerTolerance;
    }
}
