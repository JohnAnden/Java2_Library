module com.example.java2_library {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java2_library to javafx.fxml;
    exports com.example.java2_library;
}