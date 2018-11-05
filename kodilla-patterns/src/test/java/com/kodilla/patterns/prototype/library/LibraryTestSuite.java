package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("possible to borrow");

        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 5, 5));
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1834, 6, 28));
        Book book3 = new Book("Dziady", "Adam Mickiewicz", LocalDate.of(1822, 8, 6));
        Book book4 = new Book("Sonety krymskie", "Adam Mickiewicz", LocalDate.of(1825, 8, 6));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

    //    library.addBook(new Book("ddd","ff",LocalDate.of(2008,4,3)));

        Library clonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My list - cloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;

        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("My list - deep copy");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

     //   library.removeBook(book1);
        library.removeBook(0);

        System.out.println(library.toString());

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepCopyLibrary.getBooks().size());
    }
}
