package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Testing Calculator class
        Calculator calculator = new Calculator(5,5); // musiałem tu coś wpisać bo się nie kompilowało

        int add = calculator.add(180, 19);
        int subtract = calculator.subtract(200, 150);
        if ((add == 199) && (subtract == 50)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }


    }
}