package com.example.java2_library.Models;
import com.example.java2_library.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookQueries {

    DbConnection connect = new DbConnection();


    private PreparedStatement selectAllBooks;
    private PreparedStatement selectBooksByTitle;
    private PreparedStatement selectBooksByFirstName;
    private PreparedStatement selectBooksByLastName;
    private PreparedStatement selectBooksByYear;
    private PreparedStatement selectBooksByISBN;

    public BookQueries() {

        try {
            //show all books
            selectAllBooks = connect.getConnection().prepareStatement(
                    "SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                            + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                            "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"");
            // Search by title
            selectBooksByTitle = connect.getConnection().prepareStatement(
                    "SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                            + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                            "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"" +
                            "AND \"Book\".\"bookTitle\" LIKE ?");

            selectBooksByFirstName = connect.getConnection().prepareStatement("SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                    + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                    "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"" +
                    "AND \"Author\".\"fName\" LIKE ?");

            selectBooksByLastName = connect.getConnection().prepareStatement("SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                    + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                    "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"" +
                    "AND \"Author\".\"lName\" LIKE ?");

            selectBooksByYear = connect.getConnection().prepareStatement(
                    "SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                            + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                            "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"" +
                            "AND \"Book\".\"year\" LIKE ?");

            selectBooksByISBN = connect.getConnection().prepareStatement(
                    "SELECT \"Book\".\"ISBN\", \"Book\".\"bookTitle\", \"Author\".\"fName\", \"Author\".\"lName\", \"Book\".\"bookCategory\", \"Book\".\"year\""
                            + "FROM \"Biblioteket\".\"Book\", \"Biblioteket\".\"BookAuthorship\", \"Biblioteket\".\"Author\"" +
                            "WHERE \"Book\".\"ISBN\" =  \"BookAuthorship\".\"ISBN\" AND \"Author\".\"authorId\" = \"BookAuthorship\".\"authorId\"" +
                            "AND \"Book\".\"ISBN\" LIKE ?");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }

    public List<Book> getAllBooks() {
        try (ResultSet resultSet = selectAllBooks.executeQuery()) {
            List<Book> results = new ArrayList<Book>();

            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("isbn"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
    public List<Book> getBooksByTitle(String bookTitle) {
        try {
            selectBooksByTitle.setString(1, bookTitle);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        try (ResultSet resultSet = selectBooksByTitle.executeQuery()) {
            List<Book> results = new ArrayList<Book>();
            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("isbn"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    public List<Book> getBooksByFName(String fName) {
        try {
            selectBooksByFirstName.setString(1, fName);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        try (ResultSet resultSet = selectBooksByFirstName.executeQuery()) {
            List<Book> results = new ArrayList<Book>();
            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("isbn"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    public List<Book> getBooksByLName(String lName) {
        try {
            selectBooksByLastName.setString(1, lName);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        try (ResultSet resultSet = selectBooksByLastName.executeQuery()) {
            List<Book> results = new ArrayList<Book>();
            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("isbn"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }
    public List<Book> getBooksByYear(String year) {
        try {
            selectBooksByYear.setString(1, year);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        try (ResultSet resultSet = selectBooksByYear.executeQuery()) {
            List<Book> results = new ArrayList<Book>();
            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("isbn"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    public List<Book> getBooksByISBN(String isbn) {
        try {
            selectBooksByISBN.setString(1, isbn);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

        try (ResultSet resultSet = selectBooksByISBN.executeQuery()) {
            List<Book> results = new ArrayList<Book>();
            while (resultSet.next()) {
                results.add(new Book(
                        resultSet.getString("ISBN"),
                        resultSet.getString("bookTitle"),
                        resultSet.getString("fName"),
                        resultSet.getString("lName"),
                        resultSet.getString("bookCategory"),
                        resultSet.getString("year")));
            }
            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

}


