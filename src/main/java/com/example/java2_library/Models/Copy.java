package com.example.java2_library.Models;

public class Copy {
    private int barcode;
    private boolean copyStatus;
    private String loanCategory;
    private String isbn; //tillfällig lösning, behöver synkas med Book.isbn
    private String dvdId;

    public Copy(int barcode, boolean copyStatus, String loanCategory, String isbn, String dvdId) {
        this.barcode = barcode;
        this.copyStatus = copyStatus;
        this.loanCategory = loanCategory;
        this.isbn = isbn;
        this.dvdId = dvdId;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public boolean isCopyStatus() {
        return copyStatus;
    }

    public void setCopyStatus(boolean copyStatus) {
        this.copyStatus = copyStatus;
    }

    public String getLoanCategory() {
        return loanCategory;
    }

    public void setLoanCategory(String loanCategory) {
        this.loanCategory = loanCategory;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDvdId() {
        return dvdId;
    }

    public void setDvdId(String dvdId) {
        this.dvdId = dvdId;
    }
}
