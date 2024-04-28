package com.luv2code.demo;

import java.time.LocalDate;

public abstract class Item {

    private String title;
    private String author;
    private LocalDate Publication;
    private ItemType itemType;

    public Item() {

    }

    public Item(String title, String author, LocalDate publication, ItemType itemType) {
        this.title = title;
        this.author = author;
        Publication = publication;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublication() {
        return Publication;
    }

    public void setPublication(LocalDate publication) {
        Publication = publication;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public abstract String displayInfo();

}
