package zad1;

/*
4.1. Środowisko programistyczne (IDE)
Zadanie: Powtórzenie kolekcji
Jak wspomnieliśmy we wprowadzeniu, rozpoczynamy serię zadań powtórkowych, które pozwolą na utrwalenie wiedzy zdobytej do tej pory.

Wykorzystaj poniższą listę do iteracji w pętli for:

List<String> companies = new ArrayList();
companies.add("DELL");
companies.add("APPLE");
companies.add("SAMSUNG");
companies.add("SONY");
companies.add("ALCATEL");
Używając konkatenacji zapisz wszystkie nazwy po przecinku tak aby otrzymać wynik:

DELL, APPLE, SAMSUNG, SONY, ALCATEL
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Kodilla {
    public static void main (String[] args) throws java.lang.Exception {

        List<String> companies = new ArrayList<String>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for ( String theObject: companies) {
            System.out.print(theObject + ", ");
        }
    }
}