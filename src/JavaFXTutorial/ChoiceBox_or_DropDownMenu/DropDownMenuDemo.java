package JavaFXTutorial.ChoiceBox_or_DropDownMenu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DropDownMenuDemo extends Application {

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

        clickMeButton.setOnAction(event -> getSelectedItem(choiceBox));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, clickMeButton);
        layout.setPadding(new Insets(20, 5, 5, 5));
        layout.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

    private void getSelectedItem(ChoiceBox<String> choiceBox) {
        String string = choiceBox.getValue();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText("Selected Item");
        alert.setContentText(string);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.showAndWait();
    }
}
