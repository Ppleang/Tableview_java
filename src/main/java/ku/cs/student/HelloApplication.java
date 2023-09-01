package ku.cs.student;

import ku.cs.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "", 600, 400);
        stage.setMaxHeight(400);
        stage.setMaxWidth(600);
        stage.setHeight(400);
        stage.setWidth(600);
        configRoute();
        FXRouter.goTo("hello");
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("student-list", viewPath + "student-list.fxml");
        FXRouter.when("student-score", viewPath + "student-score.fxml");
        FXRouter.when("students-table", viewPath + "students-table.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}