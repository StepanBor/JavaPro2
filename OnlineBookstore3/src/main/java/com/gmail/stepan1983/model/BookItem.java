package com.gmail.stepan1983.model;

import com.gmail.stepan1983.DTO.BookItemDTO;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "books1")
public class BookItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="bookId")
    private long id;

    private String bookName;

    private String description;

    private String author;

    @ManyToOne(cascade = CascadeType.ALL)
//    @ManyToOne
    private Publisher publisher;

    @ManyToOne(cascade = CascadeType.ALL)
//    @ManyToOne
    private CategoryItem category;

    private Double price;

    @OneToOne(cascade = CascadeType.ALL)
//    @OneToOne
    private StorageBooks storageBooks;

    private File image;

    public BookItem(String bookName, String description, String author,
                    Publisher publisher, CategoryItem category, Double price,
                    StorageBooks storageBooks, File image) {
        this.bookName = bookName;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.storageBooks = storageBooks;
        this.image = image;
    }

    public BookItem() {
    }

    public BookItemDTO toDTO(){
        return new BookItemDTO(id,bookName,description,author,publisher.getPublisherName(),
                category.getCategoryName(),price,storageBooks.getId());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public CategoryItem getCategory() {
        return category;
    }

    public void setCategory(CategoryItem category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public StorageBooks getStorageBooks() {
        return storageBooks;
    }

    public void setStorageBooks(StorageBooks storageBooks) {
        this.storageBooks = storageBooks;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }
}
