package JavaFXTutorial.Extract_and_Validate_Input;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Demo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        window.setTitle("Title of the window");

        VBox layout = new VBox(8);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // Form
        TextField textField = new TextField();
        Button clickMe = new Button("Click me!");

        clickMe.setOnAction(e -> isAnInteger(textField, textField.getText()));

        layout.getChildren().addAll(textField, clickMe);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

    private Boolean isAnInteger(TextField textField, String message) {
        try {
            int age = Integer.parseInt(message);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("You are " + age);
            alert.showAndWait();
            return true;
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Oops there was an error!");
            alert.showAndWait();
            return false;
        }
    }
}
