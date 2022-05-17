module com.example.java2_library {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java2_library to javafx.fxml;
    opens com.example.java2_library.Controllers to javafx.fxml ;
    opens com.example.java2_library.Models to javafx.base;
    exports com.example.java2_library;
}