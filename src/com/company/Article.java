package com.company;

import java.util.Date;

public interface Article {
    public String getTitle();
    public String getContent();
    public String getAuthor();
    public void setTitle(String title);
    public void setContent(String content);
    public void setAuthor(String author);
    public void printArticle();
}
