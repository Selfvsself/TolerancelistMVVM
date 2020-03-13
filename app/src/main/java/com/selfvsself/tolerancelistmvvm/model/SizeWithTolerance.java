package com.selfvsself.tolerancelistmvvm.model;

public class SizeWithTolerance {

    private double size;
    private String tolerance;
    private double upperTolerance;
    private double lowerTolerance;
    private String standardName;

    public SizeWithTolerance(double size, String tolerance, double upperTolerance, double lowerTolerance) {
        this.size = size;
        this.tolerance = tolerance;
        this.upperTolerance = upperTolerance;
        this.lowerTolerance = lowerTolerance;
    }

    public double getSize() {
        return size;
    }

    public String getTolerance() {
        return tolerance;
    }

    public double getUpperTolerance() {
        return upperTolerance;
    }

    public double getLowerTolerance() {
        return lowerTolerance;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }
}
