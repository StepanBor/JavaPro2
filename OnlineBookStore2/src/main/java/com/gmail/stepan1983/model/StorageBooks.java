package com.gmail.stepan1983.model;

import javax.persistence.*;

@Entity
@Table(name = "StorageBooks1")
public class StorageBooks {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.PERSIST)
//    @OneToOne
    private BookItem book;

    @OneToOne(cascade = CascadeType.PERSIST)
//    @OneToOne
    private Stock stock;

    private Long bookQuantity;

    public StorageBooks(BookItem book, Stock stock, Long bookQuantity) {
        this.book = book;
        this.stock = stock;
        this.bookQuantity = bookQuantity;
    }

    public StorageBooks() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BookItem getBook() {
        return book;
    }

    public void setBook(BookItem book) {
        this.book = book;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Long getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Long bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
