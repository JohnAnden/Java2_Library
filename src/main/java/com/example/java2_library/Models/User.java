package com.example.java2_library.Models;

public class User {
    private int userId;
    private String fName;
    private String lName;
    private String dOB;
    private String phoneNo;
    private String street;
    private String postCode;
    private String city;
    private String email;
    private String password;
    private String accountTypeNo;

    public User() {}

    public User(int userId, String fName, String lName,String dOB,
                String phoneNo, String street, String postCode, String city,
                String email, String password, String accountTypeNo) {
        setUserId(userId);
        setfName(fName);
        setlName(lName);
        setdOB(dOB);
        setPhoneNo(phoneNo);
        setStreet(street);
        setPostCode(postCode);
        setCity(city);
        setEmail(email);
        setPassword(password);
        setAccountTypeNo(accountTypeNo);

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountTypeNo() {
        return accountTypeNo;
    }

    public void setAccountTypeNo(String accountTypeNo) {
        this.accountTypeNo = accountTypeNo;
    }
    @Override
    public String toString()
    {return getlName() + ", " + getfName();
}

}
