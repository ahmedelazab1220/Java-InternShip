package com.luv2code.demo;

import java.time.LocalDate;

public class DVD extends Item {

    private int duration;
    private String language;

    public DVD(String title, String author, LocalDate publication, int duration, String language) {
        super(title, author, publication, ItemType.DVD);
        this.duration = duration;
        this.language = language;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String displayInfo() {
        return "DVD{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", Publication=" + getPublication() +
                ", duration=" + getDuration() +
                ", language=" + getLanguage() +
                '}';
    }
}
