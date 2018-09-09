package zad5;

/*
Część 1

Stwórz klasę reprezentującą książkę o nazwie Book. Klasa powinna mieć dwa pola: author oraz title. Pamiętaj o implementacji metod hashCode() oraz equals(Object o). Będziemy jej używali jako obiektów kolekcji LinkedList w tej części zadania, oraz jako obiektów kolekcji HashMap w drugiej części zadania.

Stwórz program, który zmierzy czas operacji wyszukiwania i usunięcia obiektu na początku (z użyciem metody remove(Object o)), wyszukiwania i usunięcia obiektu na końcu (z użyciem metody remove(Object o)), wstawiania na początku oraz wstawiania na końcu listy LinkedList liczącej kilka milionów obiektów.

Część 2

Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i usuwania obiektu z mapy HashMap liczącej kilka milionów obiektów
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Kodilla{

    public static void main(String[] args) {
        List<Book> library = new LinkedList<>();

        library.add(new Book("Faktotum", "Charles Bukowski"));
        library.add(new Book("Grywalizacja w Pracy", "Paweł Tkaczyk"));
        library.add(new Book("Obce miasto Wrocław 1945 i potem", "Gregor Thum"));
        library.add(new Book("Początek", "Dan Brown"));

        long begin = System.nanoTime();
        library.remove("Początek");
        long end = System.nanoTime();
        System.out.println("Removing element at the end of collection has taken: " + (end - begin) + "ns");


        begin = System.nanoTime();
        library.remove("Faktotum");
        end = System.nanoTime();
        System.out.println("Removing element at the start of collection has taken: " + (end - begin) + "ns");

        Map<Integer, Integer> lister = new HashMap<>();
        Random randomGenerator = new Random();
        int maxLibrary = 6000000;

        for (int i = 0; i < maxLibrary; i++) {
            lister.put(i, randomGenerator.nextInt(100));
        }

        begin = System.nanoTime();
        lister.get(99);
        end =  System.nanoTime();
        System.out.println("Searching key number:99 in " + lister.size() + " list long,in: " + (end - begin) + "ns");

        begin = System.nanoTime();
        lister.put(maxLibrary,99);
        end = System.nanoTime();
        System.out.println("Adding new element in: " + maxLibrary + " position in list "+ lister.size() + " long,in: " + (end - begin) + "ns");

        begin = System.nanoTime();
        lister.remove(maxLibrary,99);
        end = System.nanoTime();
        System.out.println("Removing element: " + maxLibrary + " in list "+ lister.size() + " long,in: " + (end - begin) + "ns");
    }
}
class Book {
    private String title;
    private String author;

    public Book(final String title, final String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        final Book book = (Book) obj;
        return this.title.equals(book.getTitle()) &&
                this.author.equals(book.getAuthor());
    }
}
