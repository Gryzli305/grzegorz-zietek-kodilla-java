package zad4;

/*
2.4. Wrappery
Zadanie: Wrapper prymitywowi (nie)równy?
Napisz program, przypisujący jakieś wartości do zmiennych o typach prymitywnych. Następnie takie same wartości przypisz
do typów będących wrapperami typów prymitywnych. Niech program porówna, czy wartości w typach prymitywnych oraz odpowiadających
 im wrapperach są sobie równe. Do realizacji zadania wybierz trzy dowolne typy prymitywne.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Simple {

    private int liczba1;
    private double liczba2;
    private float liczba3;

    public Simple (int liczba1, double liczba2, float liczba3) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
    }

    public int getLiczba1() {
        return this.liczba1;
    }
    public double getLiczba2() {
        return this.liczba2;
    }
    public float getLiczba3() {
        return this.liczba3;
    }
}
class Wrap{
    Integer liczba4;
    Double liczba5;
    Float liczba6;

    public Wrap(Integer liczba4, Double liczba5, Float liczba6){
        this.liczba4 = liczba4;
        this.liczba5 = liczba5;
        this.liczba6 = liczba6;
    }
    public Integer getLiczba4() {
        return this.liczba4;
    }
    public Double getLiczba5() {
        return this.liczba5;
    }
    public Float getLiczba6() {
        return this.liczba6;
    }
}
class App{
    public static void main (String[] args) {

        Simple simple = new Simple(5, 6.6, 3.14F);
        Wrap wrap = new Wrap(5, 6.6, 3.14F);

        int liczba1 = simple.getLiczba1();
        double liczba2 = simple.getLiczba2();
        float liczba3 = simple.getLiczba3();

        Integer liczba4 = wrap.getLiczba4();
        Double liczba5 = wrap.getLiczba5();
        Float liczba6 = wrap.getLiczba6();

        System.out.println("Liczba 5 " + (liczba1 == liczba4));
        System.out.println("Liczba 6.6 " + (liczba2 == liczba5));
        System.out.println("Liczba 3.14F " + (liczba3 == liczba6));
    }
}