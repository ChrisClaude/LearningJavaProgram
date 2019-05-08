package JavaFXTutorial.ListView;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        window.setTitle("List View Demo");

        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Spider Man", "T'Chala", "Thor", "Captain America");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(event -> buttonClicked());


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 10, 10, 10));
        layout.getChildren().addAll(listView, submitButton);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";

        ObservableList<String> stringObservable = listView.getSelectionModel().getSelectedItems();

        for (String str : stringObservable) {
            message += str + "\n";
        }

        System.out.println(message);
    }
}
