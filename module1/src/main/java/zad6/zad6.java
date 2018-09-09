package zad6;

/*
1.6. Klasa Object
Zadanie: Użycie metody hashCode()
Przeanalizuj poniższy kod: https://kodilla.com/pl/project-java/38596 . Zobaczysz w nim wywołanie metody hashCode() na obiekcie SampleObject,
 który przedstawia przykładowy obiekt, jak widzisz nie dziedziczy on żadnej innej klasy, a jednak posiada metodę hashCode(). Stwórz swoją własną klasę i obiekt,
  a następnie wywołaj na nim metodę hashCode().
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Serwis {
}
class Application {
    public static void main (String[] args) throws java.lang.Exception
    {
        Serwis serwis = new Serwis();
        int result = serwis.hashCode();

        System.out.println(result);

    }
}