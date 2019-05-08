package JavaFXTutorial.ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

    Stage window;
    Button submitButton;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Combo Box Demo");


        submitButton = new Button("Submit");


        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Black Panther", "Avengers: End Game", "Saint City", "Romeo and Juliette", "When all started", "My life in college");
        comboBox.setVisibleRowCount(4);
        comboBox.setPromptText("What is your favorite movie?");

        // when an item is selected from the comboBox
        comboBox.setOnAction(event -> System.out.println("You selected " + comboBox.getValue()));

        submitButton.setOnAction(e -> System.out.println(comboBox.getValue()));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(comboBox, submitButton);
        layout.setPadding(new Insets(20, 5, 5, 5));
        layout.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }
}
