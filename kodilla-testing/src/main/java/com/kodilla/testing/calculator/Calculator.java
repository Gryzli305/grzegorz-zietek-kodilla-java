package com.kodilla.testing.calculator;

public class Calculator {

    public Calculator(int a, int b) {
  //      System.out.println(add(a,b));
  //      System.out.println(subtract(a,b));
    }

    public int add(int a, int b) {
           return a + b;
        }
    public int subtract(int a, int b) {
            return a - b;
        }
}

class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,5);
        calculator.add(5,5);
        calculator.subtract(5,5);

    }
}
