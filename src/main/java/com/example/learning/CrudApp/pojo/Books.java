package com.example.learning.CrudApp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Books {

    @Id
    @Column(name="isn")
    private String isn;
    @Column(name="book_name")
    private String book_name;
    @Column(name="authors")
    private String authors;
    @Column(name="publishedDate")
    private String publishedDate;
    @Column(name="price")
    private String price;

    public Books(){

    }

    public Books(String isn, String name, String authors, String publishedDate, String price) {
        this.isn = isn;
        this.book_name = name;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.price = price;
    }

    public String getIsn() {
        return isn;
    }

    public void setIsn(String isn) {
        this.isn = isn;
    }

    public String getName() {
        return book_name;
    }

    public void setName(String name) {
        this.book_name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
