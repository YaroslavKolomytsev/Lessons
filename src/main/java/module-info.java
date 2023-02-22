module com.example.alishevschool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alishevschool to javafx.fxml;
    exports com.example.alishevschool;
}