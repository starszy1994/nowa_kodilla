package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class BookManager {

    private static List<Book> bookList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        return book;
    }
    public List<Book> getBookList() {
        return bookList;
    }

    public void addToList (Book firstBook) {
        if (!bookList.contains(firstBook)) {
            bookList.add(firstBook);
        } else {
            System.out.println("The book exists");
        }
    }
}