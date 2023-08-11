module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.student to javafx.fxml;
    exports ku.cs.student;

    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;

    exports ku.cs.models;
    opens ku.cs.models to javafx.base;
}