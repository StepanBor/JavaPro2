package com.gmail.stepan1983.model;

import javax.persistence.*;

@Entity
@Table(name = "Category1")
public class CategoryItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String categoryName;

    private String description;

    public CategoryItem(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
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
}
