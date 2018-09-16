package com.kodilla.testing.ShapeCollector;

public class Square implements Shape {

    double a;
    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return a * a;
    }
    public Square(double a) {
        this.a = a;
    }
//a*a
}
