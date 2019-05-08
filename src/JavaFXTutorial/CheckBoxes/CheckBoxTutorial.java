package JavaFXTutorial.CheckBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxTutorial extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("Title of the window");

        CheckBox checkBox = new CheckBox("Sauce Salad");

        // checkBox selected by default
        checkBox.setSelected(true);
        CheckBox checkBox1 = new CheckBox("Sauce Fish");

        // order button
        Button orderNowBtn = new Button("Order Now!");
        orderNowBtn.setOnAction(e -> handleOptions(checkBox, checkBox1));


        VBox layout = new VBox(10);
        layout.getChildren().addAll(checkBox, checkBox1, orderNowBtn);
        layout.setPadding(new Insets(20, 5, 5, 5));
        layout.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox checkBox1, CheckBox checkBox2) {
        String message = "User order(s):\n";

        if (checkBox1.isSelected())
            message += checkBox1.getText() + "\n";

        if (checkBox2.isSelected())
            message += checkBox2.getText() + "\n";

        Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
        alert.showAndWait();

    }
}
