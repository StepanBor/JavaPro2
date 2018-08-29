package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category1")
public class CategoryItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String categoryName;

    private String description;

//    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BookItem> books;

    public CategoryItem(String categoryName, String description, List<BookItem> books) {
        this.categoryName = categoryName;
        this.description = description;
        this.books=books;
    }

    public CategoryItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
