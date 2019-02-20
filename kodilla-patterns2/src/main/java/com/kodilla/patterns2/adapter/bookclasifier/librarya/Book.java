package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final String singature;

    public Book(final String author, final String title, final int publicationYear, final String singature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.singature = singature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSingature() {
        return singature;
    }
}
