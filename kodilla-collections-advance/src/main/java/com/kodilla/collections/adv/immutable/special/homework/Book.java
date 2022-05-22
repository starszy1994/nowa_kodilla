package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}