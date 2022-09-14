package truc.View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainView extends Pane {

    // White-Grey : #EDEDE9
    // White-Beige : #F5EBE0
    // Beige-Taupe : #D7CCC2
    // Orange : #D5BDAF
    // Beige : #E3D5CA

    Pane AssignmentView = new AssignmentView();
    Pane PastAssignmentView = new PastAssignmentView();

    FileInputStream background = new FileInputStream("src/main/java/resources/Background.png");

    public MainView() throws FileNotFoundException {
        this.setView();
    }

    private void setView() {
        this.setPrefSize(1200, 800);
        this.getChildren().add(new ImageView(new Image(background)));
    }

}
