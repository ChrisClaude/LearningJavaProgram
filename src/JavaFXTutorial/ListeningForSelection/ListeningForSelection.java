package JavaFXTutorial.ListeningForSelection;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListeningForSelection extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        window.setTitle("Choice Box Demo");
        Button clickMeButton = new Button("Click Me!");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        // get items returns the observable list you can add items to
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bananas", "Pineapple", "Orange");

        // set a default value
        choiceBox.setValue("Apple");

        // Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("You sure want some " + newValue + "?");
            alert.showAndWait();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, clickMeButton);
        layout.setPadding(new Insets(20, 5, 5, 5));
        layout.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

}

