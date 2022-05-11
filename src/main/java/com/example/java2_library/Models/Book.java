package com.example.java2_library.Models;

public class Book {

    private String isbn;
    private String bookTitle;
    private int year;
    private String bookCategory;
    private String author;
    private boolean isNotAvilable;

    public Book(String isbn, String bookTitle, int year, String bookCategory, String a, boolean notavailable) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.year = year;
        this.bookCategory = bookCategory;
        author = a;
        isNotAvilable = notavailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getNotAvilable() {
        return isNotAvilable;
    }

    public void setNotAvilable(boolean notAvilable) {
        isNotAvilable = notAvilable;
    }

    public void printInfo() {
    }

}
