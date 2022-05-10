module com.example.java2_library {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2_library to javafx.fxml;
    exports com.example.java2_library;
}