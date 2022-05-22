package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager1 = new BookManager();
        Book firstBook = bookManager1.createBook("Born a Crime", "Trevor Noah");

        bookManager1.addToList(firstBook);
        Book secondBook = bookManager1.createBook("Born a Crime", "Trevor Noah");

        bookManager1.addToList(secondBook);
        Book thirdBook = bookManager1.createBook("Origin", "Dan Brown");
        bookManager1.addToList(thirdBook);
    }
}