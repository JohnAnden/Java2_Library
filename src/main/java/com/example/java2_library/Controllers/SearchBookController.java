package com.example.java2_library.Controllers;

import com.example.java2_library.HelloApplication;
import com.example.java2_library.Models.Book;
import com.example.java2_library.Models.BookQueries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
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

    // Till login-knappen som går till Login-vyn.
    private Stage stage;
    private Scene scene;
    private Parent root;

    private final BookQueries bookqueries = new BookQueries();
    private ObservableList<Book> books = FXCollections.observableArrayList();

    public void initialize(){
        tableViewSearchBook.setItems(books);
        getAllEntries();

        tableViewSearchBook.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {

                } );
    }

    // Sökning för varje knapp.
    private void getAllEntries(){
        books.setAll(bookqueries.getAllBooks());
        selectFirstEntry();
    }
    private void selectFirstEntry(){
        tableViewSearchBook.getSelectionModel().selectFirst();
    }

    @FXML
    void findTitleButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByTitle(titleTextField.getText() + "%");
        getAllEntries();
        columnTitle();
        listBooks(bookList, books);
    }

    @FXML
    void findFirstNameButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByFName(fNameTextField.getText() + "%");
        getAllEntries();
        columnTitle();
        listBooks(bookList, books);
    }

    @FXML
    void findLastNameButtonPressed(ActionEvent event) {

        List<Book> bookList = bookqueries.getBooksByLName( lNameTextFiled.getText() + "%");
        getAllEntries();
        columnTitle();
        listBooks(bookList, books);
    }

    @FXML
    void findYearButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByYear( yearTextField.getText() + "%");
        getAllEntries();
        columnTitle();
        listBooks(bookList, books);
    }

    @FXML
    void findISBNButtonPressed(ActionEvent event) {
        List<Book> bookList = bookqueries.getBooksByISBN(isbnTextField.getText() + "%");
        getAllEntries();
        columnTitle();
        listBooks(bookList, books);
    }

// Knapp som går till inloggningsvyn
    @FXML
    void loginButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/java2_library/Login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // metod som sätter CellValueFactory för TableView.
    public void columnTitle(){
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        bookTitleColumn.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        bookCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("bookCategory"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

    }
    // Lista för sökningen
    public void listBooks(List<Book> bookList, ObservableList<Book> books) {
        books.setAll(bookList);
        selectFirstEntry();
    }

}
