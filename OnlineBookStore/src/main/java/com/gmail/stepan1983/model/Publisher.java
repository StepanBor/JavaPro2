package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Publisher1")
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String publisherName;

    private String publisherAdress;

    private String description;

    @OneToMany
    private List<BookItem> books;

    public Publisher(String publisherName,
                     String publisherAdress, String description, List<BookItem> books) {
        this.publisherName = publisherName;
        this.publisherAdress = publisherAdress;
        this.description = description;
        this.books = books;
    }

    public Publisher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAdress() {
        return publisherAdress;
    }

    public void setPublisherAdress(String publisherAdress) {
        this.publisherAdress = publisherAdress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BookItem> getBooks() {
        return books;
    }

    public void setBooks(List<BookItem> books) {
        this.books = books;
    }
}
