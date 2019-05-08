package JavaFXTutorial.Closing_the_Program_properly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxClosingDemo extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Title of the window");

        // this is called when the user wants to exit and presses the close X button on the top right side os the window
        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });

        Button exitBtn = new Button("Exit");
        exitBtn.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();

        layout.getChildren().add(exitBtn);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

    public void closeProgram() {
        Boolean answer = ConfirmBox.display("Confirmation box", "Are you sure you want to exit?");

        if (answer)
            window.close();
    }
}
