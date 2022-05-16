package com.example.java2_library.Controllers;

import com.example.java2_library.Models.Book;
import com.example.java2_library.Models.BookQueries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class SearchBookController {
    @FXML
    private TableColumn<Book, String> bookCategoryColumn;

    @FXML
    private TableColumn<Book, String> bookTitleColumn;

    @FXML
    private TableColumn<Book, String> firstNameColumn;

    @FXML
    private TableColumn<Book, String> isbnColumn;

    @FXML
    private TableColumn<Book, String> lastNameColumn;

    @FXML
    private TableView<Book> tableViewSearchBook;

    @FXML
    private TableColumn<Book, String> yearColumn;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextField fNameTextField;

    @FXML
    private TextField lNameTextFiled;

    @FXML
    private TextField yearTextField;

    @FXML
    private TextField isbnTextField;


    private final BookQueries bookqueries = new BookQueries();
    private ObservableList<Book> books = FXCollections.observableArrayList();

    public void initialize(){
        tableViewSearchBook.setItems(books);
        getAllEntries();

        tableViewSearchBook.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {

                } );

    }

    private void getAllEntries(){
        books.setAll(bookqueries.getAllBooks());
        selectFirstEntry();
    }
    private void selectFirstEntry(){
        tableViewSearchBook.getSelectionModel().selectFirst();
    }

    @FXML // list all books
    void listBookPressed(ActionEvent event) {
        getAllEntries();
        columnTitle();

    }

    @FXML
    void findTitleButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByTitle(titleTextField.getText() + "%");
        getAllEntries();

        columnTitle();

        if (books.size() > 0) {
            books.setAll(bookList);
            selectFirstEntry();
        }
        else{
            displayAlert(Alert.AlertType.INFORMATION, "Title not found", "Cannot find entry with specified title");
        }
    }

    @FXML
    void findFirstNameButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByFName(fNameTextField.getText() + "%");
        getAllEntries();

        columnTitle();

        if (books.size() > 0) {
            books.setAll(bookList);
            selectFirstEntry();
        }
        else{
            displayAlert(Alert.AlertType.INFORMATION, "Title not found", "Cannot find entry with specified title");
        }
    }

    @FXML
    void findLastNameButtonPressed(ActionEvent event) {

        List<Book> bookList = bookqueries.getBooksByLName( lNameTextFiled.getText() + "%");
        getAllEntries();
        columnTitle();

        if (books.size() > 0) {
            books.setAll(bookList);
            selectFirstEntry();
        }
        else{
            displayAlert(Alert.AlertType.INFORMATION, "Title not found", "Cannot find entry with specified title");
        }
    }

    @FXML
    void findYearButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByYear( yearTextField.getText() + "%");
        getAllEntries();
        columnTitle();

        if (books.size() > 0) {
            books.setAll(bookList);
            selectFirstEntry();
        }
        else{
            displayAlert(Alert.AlertType.INFORMATION, "Title not found", "Cannot find entry with specified title");
        }
    }

    @FXML
    void findISBNButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByISBN(isbnTextField.getText() + "%");
        getAllEntries();

        columnTitle();

        if (books.size() > 0) {
            books.setAll(bookList);
            selectFirstEntry();
        }
        else{
            displayAlert(Alert.AlertType.INFORMATION, "Title not found", "Cannot find entry with specified title");
        }
    }




    public void columnTitle(){
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        bookTitleColumn.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        bookCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("bookCategory"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

    }
    public void displayAlert(Alert.AlertType type, String title, String message){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
