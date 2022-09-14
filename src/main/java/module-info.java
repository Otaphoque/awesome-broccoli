module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens truc.Controller to javafx.controls, javafx.fxml;
    exports truc;
}