package com.gmail.stepan1983.model;

import java.util.Comparator;

public class BookComparator implements Comparator<BookItem> {

    private String sortBy;
    private int sortDirection;

    public BookComparator(String sortBy, int sortDirection) {
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public int getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(int sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public int compare(BookItem b1, BookItem b2) {
        if (sortBy.equalsIgnoreCase("bookName")) {
            return b1.getBookName().compareToIgnoreCase(b2.getBookName())*sortDirection;
        }
        if (sortBy.equalsIgnoreCase("author")) {
            return b1.getAuthor().compareToIgnoreCase(b2.getAuthor())*sortDirection;
        }
        if (sortBy.equalsIgnoreCase("publisher")) {
            return b1.getPublisher().getPublisherName().compareToIgnoreCase(b2.getPublisher().getPublisherName())*sortDirection;
        }
        if (sortBy.equalsIgnoreCase("category")) {
            return b1.getCategory().getCategoryName().compareToIgnoreCase(b2.getCategory().getCategoryName())*sortDirection;
        } else {
            return (b1.getRating() - b2.getRating())*sortDirection;
        }
    }


}
