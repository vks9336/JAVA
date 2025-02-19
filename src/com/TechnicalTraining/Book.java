package com.TechnicalTraining;


public class Book {
    private String bookName;
    private String bookAuthor;
    private int numberOfPages;
    private int price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Book(String bookName, String bookAuthor, int numberOfPages, int price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public static void display(Book[] books){
        for(Book book : books){
            System.out.println("Book Name : " + book.bookName + ", Book Author : " + book.bookAuthor + ", Number of Pages : " + book.numberOfPages + ", Price : " + book.price);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Book : [ Book Name : " + this.bookName + ", Book Author : " + this.bookAuthor
                + ", Number of Pages : " + this.numberOfPages + ", Price : " + this.price + "$ ]";
    }

    public static void highest(Book[] book){
        int highest = book[0].price;

        for (Book item : book) {
            if (item.price > highest) {
                highest = item.price;
            }
        }
        for (Book b : book) {
            if (b.price == highest) {
                System.out.println("Book Name : " + b.bookName + ", Book Author : " + b.bookAuthor + ", Number of Pages : " + b.numberOfPages + ", Price : " + b.price);
            }
        }


    }
}
