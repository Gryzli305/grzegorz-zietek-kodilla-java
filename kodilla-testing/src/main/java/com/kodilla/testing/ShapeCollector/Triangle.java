package com.kodilla.testing.ShapeCollector;

public class Triangle implements Shape {

    double a;
    double h;

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return a * h /2;

    }
    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    // a*h/2
}
