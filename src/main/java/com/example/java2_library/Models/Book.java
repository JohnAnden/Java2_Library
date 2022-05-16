package com.example.java2_library.Models;

import javafx.beans.property.SimpleStringProperty;


public class Book {
    private SimpleStringProperty ISBN;
    private SimpleStringProperty bookTitle;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty bookCategory;
    private SimpleStringProperty year;

    //konstruktor for klassen Book
    public Book(String ISBN, String bookTitle, String firstName, String lastName, String bookCategory, String year) {
        this.ISBN = new SimpleStringProperty(ISBN);
        this.bookTitle = new SimpleStringProperty(bookTitle);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.bookCategory = new SimpleStringProperty(bookCategory);
        this.year = new SimpleStringProperty(year);
    }

    //Getter & Setters
    public String getISBN(){
        return ISBN.get();
    }

    public void setISBN(String ISBN){
        this.ISBN = new SimpleStringProperty(ISBN);
    }

    public String getBookTitle(){
        return bookTitle.get();
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = new SimpleStringProperty(bookTitle);

    }

    public String getFirstName(){
        return firstName.get();
    }
    public void setFirstName(String firstName){
        this.firstName = new SimpleStringProperty(firstName);
    }

    public String getLastName(){
        return lastName.get();
    }
    public void setLastName(String lastName){
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getBookCategory(){
        return bookCategory.get();
    }

    public void setBookCategory(String bookCategory){
        this.bookCategory = new SimpleStringProperty(bookCategory);

    }
    public String getYear(){
        return year.get();
    }

    public void setYear(String year){
        this.year = new SimpleStringProperty(year);
    }

    public void printInfo() {
    }
}



