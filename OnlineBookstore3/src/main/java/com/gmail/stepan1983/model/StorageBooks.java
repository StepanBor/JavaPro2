package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.util.Map;
import java.util.TreeMap;

@Entity
@Table(name = "StorageBooks1")
public class StorageBooks {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="stogrageBooksId")
    private long id;

//    @OneToOne(cascade = CascadeType.PERSIST)
////    @OneToOne
//    private BookItem book;
//    @OneToMany(cascade=CascadeType.ALL)
    @ElementCollection
    @CollectionTable(name="BookStorage",
            joinColumns=@JoinColumn(name="STORE"))
    @Column(name="COPIES_IN_STOCK")
    @MapKeyJoinColumn(name="Book", referencedColumnName="bookId")
//
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="COPIES_IN_STOCK")
//    @MapKeyJoinColumn(name="Book", referencedColumnName="bookId")
    private Map<BookItem, Integer> bookQuantityMap=new TreeMap<>((BookItem bi1, BookItem bi2)->(int)(bi1.getId()-bi2.getId()));

//    @OneToOne(cascade = CascadeType.PERSIST)
////    @OneToOne
//    private Stock stock;

    private String storageAddress;

    private String storagePhone;

//    private Long bookQuantity;

    public StorageBooks(/*BookItem book, Long bookQuantity,*/ String storageAddress,
                        String storagePhone) {
//        this.book = book;
//        this.bookQuantity = bookQuantity;
        this.storageAddress=storageAddress;
        this.storagePhone=storagePhone;

    }

    public StorageBooks() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public BookItem getBook() {
//        return book;
//    }
//
//    public void setBook(BookItem book) {
//        this.book = book;
//    }
//
//    public Long getBookQuantity() {
//        return bookQuantity;
//    }
//
//    public void setBookQuantity(Long bookQuantity) {
//        this.bookQuantity = bookQuantity;
//    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }

    public String getStoragePhone() {
        return storagePhone;
    }

    public void setStoragePhone(String storagePhone) {
        this.storagePhone = storagePhone;
    }

    public Map<BookItem, Integer> getBookQuantityMap() {
        return bookQuantityMap;
    }

    public void setBookQuantityMap(Map<BookItem, Integer> bookQuantityMap) {
        this.bookQuantityMap = bookQuantityMap;
    }

    @Override
    public String toString() {
        return "StorageBooks{" +
                "id=" + id +
//                ", bookQuantityMap=" + bookQuantityMap +
                ", storageAddress='" + storageAddress + '\'' +
                ", storagePhone='" + storagePhone + '\'' +
                '}';
    }
}

