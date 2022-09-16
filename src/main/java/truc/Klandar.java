package truc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Klandar extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/ui/UI.fxml"));
        Pane content = loader.load();

        Scene scene = new Scene(content, 1200, 800);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("K-landar");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}