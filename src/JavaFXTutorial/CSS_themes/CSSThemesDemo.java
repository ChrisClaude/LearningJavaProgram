package JavaFXTutorial.CSS_themes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CSSThemesDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("CSS Themes Demo");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 8, 5, 10));
        layout.setHgap(10);
        layout.setVgap(10);

        // Labels
        Label usernameLabel = new Label("Username:");
        usernameLabel.setId("bold-label");
        // inline css styling
//        usernameLabel.setStyle("-fx-text-fill: #e8e8e8");
        Label passwordLabel = new Label("Password:");

        // Input fields
        TextField usernameField = new TextField();
        usernameField.setPromptText("username");
        PasswordField passwordField = new PasswordField();

        // login button
        Button loginButton = new Button("Login");
//        loginButton.setOnAction(event -> setUserAgentStylesheet(STYLESHEET_CASPIAN));

        // sign up button
        Button signUpButton = new Button("Sign up");
        GridPane.setConstraints(signUpButton, 1, 3);
        signUpButton.getStyleClass().add("button-blue");

        // constraining the components
        GridPane.setConstraints(usernameLabel, 0, 0);
        GridPane.setConstraints(usernameField, 1, 0);
        GridPane.setConstraints(passwordLabel, 0, 1);
        GridPane.setConstraints(passwordField, 1, 1);
        GridPane.setConstraints(loginButton, 1, 2);

        layout.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, signUpButton);

        Scene scene = new Scene(layout, 300, 250);
        scene.getStylesheets().add("/JavaFXTutorial/CSS_themes/Eternity.css");

        window.setScene(scene);
        window.show();

    }
}
