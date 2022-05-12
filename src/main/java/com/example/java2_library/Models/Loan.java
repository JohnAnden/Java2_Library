package com.example.java2_library.Models;

import java.util.Date;

public class Loan {
    private int loanNo;
    private int userId; // behöver synkas med user
    private int barcode; // behöver synkas med copy
    private int startDate;
    private Date dateReturned;
    private Book book;

    private Receipt receipt;

    private Boolean bookStatus;

    public Loan(int loanNo,Book b, int userId, int barcode, int startDate, Date rDate, Receipt rec, boolean bStatus) {
        this.loanNo = loanNo;
        this.userId = userId;
        this.barcode = barcode;
        this.startDate = startDate;
        dateReturned = rDate;
        receipt = rec;
        bookStatus = bStatus;
        book = b;

    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }
    public Book getBook()
    {
        return book;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
    public void BookStatus() {
        Boolean available = null;
        if (bookStatus = available)
            System.out.println(  getBook().getBookTitle() + "Status: available " );
                else {
            System.out.println(  getBook().getBookTitle() + " Status : not available");
        }
}
    }

