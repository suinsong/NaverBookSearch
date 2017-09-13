package com.bit.naverbook;

/**
 * Created by suin on 2017-09-13.
 */

public class NaverBookVO {

    private String title;
    private String link;
    private String author;
    private String price;
    private String lmage;
    private String publisher;
    private String pubDate;
    private String description;


    public NaverBookVO(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLmage(String lmage) {
        this.lmage = lmage;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }

    public String getLmage() {
        return lmage;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getDescription() {
        return description;
    }
}
