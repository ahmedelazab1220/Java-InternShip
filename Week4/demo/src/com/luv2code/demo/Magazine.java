package com.luv2code.demo;

import java.time.LocalDate;

public class Magazine extends Item {

    private int issueNumber;

    public Magazine(String title, String author, LocalDate publication, int issueNumber) {
        super(title, author, publication, ItemType.MAGAZINE);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String displayInfo() {
        return "Magazine{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", Publication=" + getPublication() +
                ", issueNumber=" + getIssueNumber() +
                '}';
    }
}
