package com.luv2code.demo;

import java.time.LocalDate;

public class Book  extends Item {

    private int numberOfPages;
    private String isbn;

    public Book(String title, String author, LocalDate publication , int numberOfPages, String isbn) {
        super(title, author, publication, ItemType.BOOK);
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String displayInfo() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", Publication=" + getPublication() +
                ", isbn=" + getIsbn() +
                ", numberOfPages=" + getNumberOfPages() +
                '}';
    }
}
