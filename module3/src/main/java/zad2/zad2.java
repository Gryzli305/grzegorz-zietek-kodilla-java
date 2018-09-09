package zad2;

/*
3.2. Kolejki - Interfejs Queue i klasa ArrayDeque
Zadanie: Książki na stos!
Przy użyciu wewnętrzengo edytora Kodilli napisz program, który:

tworzy stos i umieszcza w nim pięć obiektów typu Book (możesz użyć klasy Book z przykładu),
sprawdza rozmiar stosu,
następnie usuwa wszystkie książki
i ponownie sprawdza rozmiar stosu.
Program powinien wyświetlić również, która książka została usunięta ze stosu jako ostatnia.
Rozwiązane zadanie wyślij do mentora.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book{
    String title;
    String author;
    int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}
class Order{
    Book book;
    LocalDate dateOfOrder;

    public Order(Book book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public String toString(){
        return "Order created: " + dateOfOrder + "\n" +
                " ordered book: " + book;

    }

    public Book getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }
}
class OrdersQueueExample
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book ("Faktotum", "Charles Bukowski", 1975);
        Book theBook5 = new Book ("Grywalizacja w Pracy", "Paweł Tkaczyk", 2012);

        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook3, 2017, 6, 29);
        Order theOrder4 = new Order(theBook4, 2017, 6, 30);
        Order theOrder5 = new Order(theBook5, 2017, 6, 30);

        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder5);
        theOrders.offer(theOrder4);

        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();

        Order temporaryOrder;
        temporaryOrder = theOrders.poll();

        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();

        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println();

        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
        System.out.println();
    }
}