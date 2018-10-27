package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private double a;
    private double b;
    private double val;

    @Autowired
    private Display display;

    public double add(double a, double b) {
      return  display.displayValue(val = a + b);
    }

    public double sub(double a, double b) {
      return   display.displayValue(val = a - b);
    }

    public double mul(double a, double b) {
      return   display.displayValue(val = a * b);
    }

    public double div(double a, double b) {
      return   display.displayValue(val = a / b);
    }
}
