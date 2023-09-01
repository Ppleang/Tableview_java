package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void onHelloButtonClick() {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void goToListView() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void goToTableView() {
        try {
            FXRouter.goTo("students-table");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}