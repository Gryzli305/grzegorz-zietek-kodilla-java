package zad1;

/*
2.1. Pętla for
Zadanie: Obliczamy średnią
Napisz program obliczający wartość średnią 20 elementów tablicy. Pamiętaj, że:

elementy tablicy powinny być typu int,
wynik prawdopodobnie nie będzie wartością całkowitą,
pętla powinna wyświetlić wszystkie elementy tablicy,
na koniec powinna zostać wyświetlona wartość średniej.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class BetterDynamicLoop
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] number = {25,45,33,1,78,101,22,44,69,4,56,51,43,5,88,66,77,88,99,11};


        double suma = 0;

        for(int i=0; i <number.length; i++) {
            suma = suma + number[i];
            System.out.println("Array element names[" + i + "] = " + number[i]);
        }
        System.out.println(suma / number.length);
        System.out.println(number.length);
    }
}