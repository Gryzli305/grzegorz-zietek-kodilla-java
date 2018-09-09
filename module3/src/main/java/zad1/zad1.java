package zad1;

/*
3.1. Zbiory - Interfejs Set i klasa HashSet
Zadanie: Filtrowanie zbioru książek
Przy użyciu wewnętrznego edytora Kodilla napisz program, który będzie przechowywał w zbiorze HashSet zestaw kilku obiektów reprezentujących książki.
Każda książka powinna mieć tytuł, autora i rok wydania
nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals() dla swoich książek.
Następnie, przy pomocy poznanej w poprzednim module pętli for-each wyświetl w oknie konsoli tytuły wszystkich książek znajdujących się w zbiorze, które zostały wydane przed 2010 rokiem.
Rozwiązane zadanie wyślij do mentora.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book {
    String autor;
    String title;
    YearMonth releaseDate;

    public Book (String autor, String title, int yearRelease, int monthRelease) {
        this.autor = autor;
        this.title = title;
        this.releaseDate = YearMonth.of(yearRelease, monthRelease);
    }
    public int hashCode() {
        return releaseDate.getYear() * 10 + releaseDate.getMonthValue();
    }
    public boolean equals(Object o) {
        Book e = (Book) o;
        return  (autor.equals (e.getAutor())) &&
                (title.equals (e.getTitle())) &&
                (releaseDate.getYear() == e.getReleaseDate().getYear()) &&
                (releaseDate.getMonthValue() == e.getReleaseDate().getMonthValue());
    }
    public String toString() {
        return autor + ", " + title + ", relase: " + releaseDate;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitle() {
        return title;
    }
    public YearMonth getReleaseDate() {
        return releaseDate;
    }
}

class App {
    public static void main (String[] args) {
        // your code goes here
        Book book1 = new Book ("Charles Bukowski", "Faktotum", 1975, 6);
        Book book2 = new Book ("Paweł Tkaczyk", "Grywalizacja w Pracy", 2012, 1);
        Book book3 = new Book ("Gregor Thum", "Obce miasto Wrocław 1945 i potem", 2008, 4);
        Book book4 = new Book ("Dan Brown", "Początek", 2017, 10);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);

        for(Book theBook: booksSet) {
            if(theBook.getReleaseDate().getYear() >= 2010) {
                System.out.println(theBook);
            }
        }
    }
}