package com.gmail.stepan1983;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Advert {
    private String message;
    private int id;
    private int userId;
    private Date publishDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");

    public Advert(String message, int id, int userId, String publishDate) {
        this.message = message;
        this.id = id;
        this.userId = userId;
//        this.publishDate = publishDate;
        try {
            this.publishDate = sdf.parse(publishDate);
        } catch (ParseException e) {
            e.printStackTrace();
            this.publishDate = new Date();
        }
    }

    public Advert() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public java.sql.Date getSQLPublishDate() {
        java.sql.Date temp=new java.sql.Date(publishDate.getTime());

        return temp;
    }

    public void setPublishDate(String publishDate) {
        try {
            this.publishDate = sdf.parse(publishDate);
        } catch (ParseException e) {
            e.printStackTrace();
            this.publishDate = new Date();
        }
    }

    public void setPublishDate(Date publishDate) {

        this.publishDate = publishDate;
    }
}
