package JavaFXTutorial.Embedding_Layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmbeddedLayoutsDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("Title of the window");

        // top menu
        HBox topMenu = new HBox();
        Button fileBtn = new Button("File");
        Button editBtn = new Button("Edit");
        Button viewBtn = new Button("View");
        topMenu.getChildren().addAll(fileBtn, editBtn, viewBtn);

        VBox leftMenu = new VBox();
        Button codeBtn = new Button("Code");
        Button analyzeBtn = new Button("Analyze");
        Button refactorBtn = new Button("Refactor");
        leftMenu.getChildren().addAll(codeBtn, analyzeBtn, refactorBtn);

        BorderPane layout = new BorderPane();
        layout.setTop(topMenu);
        layout.setLeft(leftMenu);



        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);

        window.show();
    }

}
