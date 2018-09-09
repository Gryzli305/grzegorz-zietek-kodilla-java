package zad1;

import java.util.*;
import java.lang.*;
import java.io.*;
/*
1.1. Programy zorientowane obiektowo czy strukturalnie?
Zadanie: Kod obiektowy to jest to!
W linku poniżej umieściliśmy kod napisany strukturalnie, zastanów się i przepisz ten kod na obiekt wraz z metodami, który nada naszemu programowi podejścia obiektowego:

https://kodilla.com/pl/project-java/38592

Od teraz przesyłaj swoje zadania do sprawdzenia bezpośrednio do mentorów (przy pomocy przycisku "Wyślij do sprawdzenia" w górnej części edytora kodu - wewnątrz projektu zadania). Jednak jeżeli chcesz coś skonsultować odnośnie kodu lub masz problem z wykonaniem zadania, to po pomoc zapraszamy właśnie na kanał help-java.
 */
class User {

    private String name;

    public User (String name) {
        this.name = name;
    }
    public boolean validateAName(String name) {

        if(name != null) {
            return true;
        } else {
            return false;
        }
    }
}
class People {

    public boolean validateAge(double age) {

        if(age > 30) {

            return true;

        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
            return false;
        }
    }
    public boolean validateHeight(double height) {

        if(height > 160)
        {
            System.out.println("User is older than 30 and higher then 160cm");
            return true;
        }  else  {

            System.out.println("User is younger than 30 or lower than 160cm");
            return false;
        }
    }
}
class Application {

    public static void main (String[] args) throws java.lang.Exception {
        String name = "Adam";
        double age = 30.5;
        double height = 180;
        User validatorA = new User("Adam");
        People validator = new People();

        boolean ageAndHeight = validator.validateAge(age) && validator.validateHeight(height);
        if(ageAndHeight) {
            validatorA.validateAName(name);
        }
    }
}
