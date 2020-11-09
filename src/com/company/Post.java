package com.company;

import java.util.Date;

public class Post implements Article{

    private String title;
    private String author = "anonime";
    private String content;

    Post(String title,  String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public void printArticle() {
        System.out.println(this.title + "\n" + this.content + "\nAutor: " + this.author);
    }
}
