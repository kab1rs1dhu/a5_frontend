module demo.assignment5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.assignment5 to javafx.fxml;
    exports demo.assignment5;
}