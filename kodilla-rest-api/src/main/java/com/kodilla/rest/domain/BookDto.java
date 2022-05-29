package com.kodilla.rest.controller;

import java.util.Objects;

public class BookDto {
    private String title;
    private String author;

    public BookDto(){
    }

    public BookDto (String tittle, String author) {
        this.title = tittle;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title) &&
                Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
