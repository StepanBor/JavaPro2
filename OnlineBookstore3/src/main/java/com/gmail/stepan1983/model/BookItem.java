package com.gmail.stepan1983.model;

import com.gmail.stepan1983.DTO.BookItemDTO;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "books1")
public class BookItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookId")
    private long id;

    private String bookName;

    private String description;

    private String author;

    private Integer rating;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @ManyToOne
    private Publisher publisher;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @ManyToOne
    private CategoryItem category;

    private Double price;

    @ManyToOne(cascade = CascadeType.ALL)
//    @OneToOne
    private StorageBooks storageBooks;

    private File cover;

    private String ISBN;

    public BookItem(String bookName, String description, String author,
                    Publisher publisher, CategoryItem category, Double price,
                    StorageBooks storageBooks, File cover, Integer rating, String ISBN) {

        this.bookName = bookName;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.storageBooks = storageBooks;
        this.cover = cover;
        this.rating = rating;
        this.ISBN=ISBN;
    }

    public BookItem() {
    }

    public BookItemDTO toDTO() {
        return new BookItemDTO(id, bookName, description, author, String.valueOf(publisher.getId()),
                category.getCategoryName(), price, storageBooks.getId(), rating,ISBN);
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

    public File getCover() {
        return cover;
    }

    public void setCover(File cover) {
        this.cover = cover;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer raiting) {
        this.rating = raiting;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", raiting=" + rating +
                ", publisher=" + publisher +
                ", price=" + price +
                ", ISBN=" + ISBN +
                '}';
    }
}
