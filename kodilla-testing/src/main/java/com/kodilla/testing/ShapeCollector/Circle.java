package com.kodilla.testing.ShapeCollector;

public class Circle implements Shape {

    private double r;

    @Override
    public String getShapeName() {
        return "circle";

    }

    @Override
    public double getField() {
        return r * r * Math.PI;
    }
    public Circle(double r) {
        this.r = r;
    }
    //3.14*r^2
}
