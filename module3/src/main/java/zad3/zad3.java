package zad3;

/*
3.3. Interfejs Iterator oraz pętla while
Zadanie: Wyścigi sum
Napisz program, który:

będzie posiadał zmienną int sumaA (zainicjowana z wartością 1000)
oraz drugą zmienną int SumaB (zainicjowana z wartością 0).
Pętle while, wewnątrz której losujemy:
liczbę typu int z zakresu 0-9 i dodawaj ją do zmiennej sumaA oraz
liczbę typu int z zakresu 0-49 i dodawaj ją do zmiennej sumaB.
Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.

W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.

Rozwiązane zadanie wyślij do mentora.
 */

import java.util.*;

class Kodilla {
    public static void main (String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int check = 0;

        Random randomGenerator = new Random();
        while(sumaA > sumaB) {
            check++;
            System.out.println("Numer przebiegu " + check);
            int firstRandom = randomGenerator.nextInt(10);
            int secondRandom = randomGenerator.nextInt(50);

            System.out.println(" Wylosowana pierwsza liczba: " + firstRandom + " ,wylosowana druga liczba: " + secondRandom);

            sumaA += firstRandom;
            sumaB += secondRandom;
            System.out.println("SumaA = " + sumaA + ",sumaB = " + sumaB);
        }
    }
}