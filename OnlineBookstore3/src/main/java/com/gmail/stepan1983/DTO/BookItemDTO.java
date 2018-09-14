package com.gmail.stepan1983.DTO;


public class BookItemDTO {

    private long id;

    private String bookName;

    private String description;

    private String author;

    private String publisher;

    private String category;

    private Double price;

    private Long storageBooksId;


    public BookItemDTO(long id, String bookName, String description, String author,
                       String publisher, String category, Double price, Long storageBooksId) {
        this.id = id;
        this.bookName = bookName;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.storageBooksId = storageBooksId;
    }

    public BookItemDTO() {
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getStorageBooksId() {
        return storageBooksId;
    }

    public void setStorageBooksId(Long storageBooksId) {
        this.storageBooksId = storageBooksId;
    }

    @Override
    public String toString() {
        return "BookItemDTO{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", storageBooksId=" + storageBooksId +
                '}';
    }
}
