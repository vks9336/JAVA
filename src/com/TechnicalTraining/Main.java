package com.TechnicalTraining;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("ABC", "ZYX", 200, 1200),
                new Book("DEF", "WVU", 300, 800),
                new Book("GHI", "TSR", 240, 450),
                new Book("JKL", "QPO", 480, 1250),
                new Book("MNO", "NML", 1000, 2400),
                new Book("PQR", "KJI", 1500, 3000),
                new Book("STU", "HGF", 100, 200)
        };
        Book.highest(books);
        System.out.println();
        Book.display(books);
        System.out.println(books[0]);
        System.out.println(books[6].getBookName());
    }
}
