package com.kodilla.testing.collection;
/*
6.3. JUnit, czyli pierwsze testy!
Zadanie: Test klasy wybierającej parzyste liczby z kolekcji
Celem zadania jest przetestowanie klasy, która udostępnia metodę przyjmującą jako argument listę ArrayList obiektów typu Integer,
 która również zwraca listę (nową) ArrayList obiektów typu Integer, stanowiących podzbiór danych wejściowych z pominięciem liczb nieparzystych.

Brzmi strasznie? Już omawiamy o co chodzi :)

Aby przygotować rozwiązanie zadania:

W katalogu src/main/java utwórz pakiet com.kodilla.testing.collection
W utworzonym pakiecie stwórz klasę OddNumbersExterminator, posiadającą metodę exterminate(ArrayList<Integer> numbers)
przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
która zwraca również kolekcję ArrayList liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
W katalogu src/test/java utwórz pakiet com.kodilla.testing.collection.
W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite, a w niej napisz testy sprawdzające, czy metoda filtrująca liczby nieparzyste działa poprawnie:
testOddNumbersExterminatorEmptyList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta)
testOddNumbersExterminatorNormalList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)
Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
Rozwiązanie zadania prześlij do repozytorium GitHub.

Link do repozytorium wklej poniżej i wyślij do mentora. Powodzenia!
 */
import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer>oddNumbersList = new ArrayList<>();

        for(int number : numbers){
            if(number%2==0){
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}




