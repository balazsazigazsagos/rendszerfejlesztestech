module com.example.autoker1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autoker1 to javafx.fxml;
    exports com.example.autoker1;
}