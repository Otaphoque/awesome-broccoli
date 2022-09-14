package truc.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    Button pastAssignmentButton;

    public void handleNewAssignment() {
        System.out.println("New Assignment Button Clicked");
    }

    public void handlePastAssignment() {
        System.out.println("Past Assignments Button Clicked");
    }

}
