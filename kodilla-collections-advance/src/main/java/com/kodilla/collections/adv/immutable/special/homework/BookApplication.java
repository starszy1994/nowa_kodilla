package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book firstBook = BookManager.createBook("Born a Crime", "Trevor Noah");
        Book secondBook = BookManager.createBook("Born a Crime", "Trevor Noah");
        Book thirdBook = BookManager.createBook("Origin", "Dan Brown");

        System.out.println(firstBook == secondBook);
        System.out.println(firstBook == thirdBook);
        System.out.println(secondBook == thirdBook);

        System.out.println(BookManager.createBook("Born a Crime", "Trevor Noah"));
        System.out.println(firstBook == BookManager.createBook("Born a Crime", "Trevor Noah"));
    }
}