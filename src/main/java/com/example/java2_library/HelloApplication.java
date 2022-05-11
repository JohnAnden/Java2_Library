package com.example.java2_library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SearchBook.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Biblioteket");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection(); // metod som kontaktar databasen.
        dbConnection.getConnection();
        launch();
    }
}