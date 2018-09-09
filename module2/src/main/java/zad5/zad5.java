package zad5;

/*
2.5. ArrayList i LinkedList
Zadanie: średnia bez skrajnych ocen oraz lista obiektów Book
Zadanie składa się z dwóch części — jedna dotyczy ArrayList, a druga LinkedList. Obie części należy zrealizować wewnątrz edytora Kodilla. Oba rozwiązania powinny być w ramach jednego projektu.

Część 1

Napisz program przy użyciu listy ArrayList, zawierającej kilkanaście ocen z przedmiotu Informatyka w liceum.
Wypełnij listę przykładowymi ocenami.
Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna), ale w taki sposób, że pominięte zostaną skrajne oceny — JEDNA najmniejsza i JEDNA największa.
Oceny największą i najmniejszą należy odnaleźć. Przykładowo, dla ocen:

3,3,4,4,4,5,5,5,6 — do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
4,4,4,4,4,4,4 — do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4
Część 2

Napisz program przy użyciu listy LinkedList, zawierającej obiekty opisujące książki. Każda książka powinna posiadać tytuł i rok wydania.
Wypełnij listę kilkoma przykładowymi pozycjami.
Następnie przy pomocy pętli for-each wyświetl tylko te książki z listy, których rok wydania jest nie starszy niż 2000.
 */
import java.util.*;

class Kodilla {
    public static void main (String[] args)  {

        System.out.println("Part One");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.getAverageRating();

        System.out.println("----------");
        System.out.println("Part Two");

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.getTitleBook();
    }

}
class MyArrayList {

    public void getAverageRating(){

        ArrayList<Double> rating = new ArrayList<Double>();
        rating.add(5.5);
        rating.add(3.0);
        rating.add(6.0);
        rating.add(3.5);
        rating.add(4.5);
        rating.add(4.0);
        rating.add(4.5);
        rating.add(2.5);
        rating.add(4.0);
        rating.add(5.0);
        rating.add(5.5);
        rating.add(3.5);
        rating.add(3.0);

        double maxValue = Collections.max(rating);
        double minValue = Collections.min(rating);
        double suma = 0;

        System.out.println("Size " + rating.size());

        for(int n = 0; n < rating.size(); n++){
            if (rating.get(n) == maxValue || rating.get(n) == minValue ) {
                rating.remove(n);
            }
        }
        System.out.println("Size after removing " + rating.size());

        for(int n = 0; n < rating.size();n++){
            suma = suma + rating.get(n);
        }

        double avg = Math.round(suma) / (double) rating.size();
        System.out.println("Average " + String.format("%.2f", avg));
    }

}
class Book {

    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
class MyLinkedList {

    public void getTitleBook()
    {

        LinkedList<Book> book = new LinkedList<Book>();
        book.add(new Book("Pan Kracy",1960));
        book.add(new Book("Factotum",2003));
        book.add(new Book("Szmira",1991));
        book.add(new Book("Z szynką na raz",2005));
        book.add(new Book("Tajemince Egiptu",2045));

        for(Book myBook : book) {
            if(myBook.getYear() <= 2000) {
                System.out.println("Book title " + myBook.getTitle());
            }
        }
    }

}
