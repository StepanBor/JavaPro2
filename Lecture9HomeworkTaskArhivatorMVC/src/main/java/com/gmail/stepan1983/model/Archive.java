package com.gmail.stepan1983.model;

import javax.persistence.*;

@Entity
@Table("Archives")
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Archive(String name) {
        this.name = name;
    }

    public Archive() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
