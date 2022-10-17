module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.base;

    opens truc.Controller to javafx.controls, javafx.fxml, javafx.graphics;
    exports truc;
}