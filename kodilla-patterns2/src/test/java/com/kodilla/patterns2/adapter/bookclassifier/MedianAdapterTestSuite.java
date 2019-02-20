package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Adam Mickiewicz",
                "Pan Tadeusz",
                1998,
                "BTVU741852"));
        bookA.add(new Book("Henryk Sienkiewicz",
                "Potop",
                1980,
                "HSP258147"));
        bookA.add(new Book("Jan Brzechwa",
                "Akademia Pana Kleksa",
                2000,
                "LKJ357789"));
        bookA.add(new Book("Aleksander Fredro",
                "Zemsta",
                1977,
                "MNHL159963"));

        //When
        int median = medianAdapter.publicationYearMediana(bookA);

        //Then
        Assert.assertEquals(1998, median);

    }
}
