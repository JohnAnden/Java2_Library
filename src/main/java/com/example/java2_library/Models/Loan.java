package com.example.java2_library.Models;

public class Loan {
    private int loanNo;
    private int userId; // behöver synkas med user
    private int barcode; // behöver synkas med copy
    private int startDate;

    public Loan(int loanNo, int userId, int barcode, int startDate) {
        this.loanNo = loanNo;
        this.userId = userId;
        this.barcode = barcode;
        this.startDate = startDate;

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
}
