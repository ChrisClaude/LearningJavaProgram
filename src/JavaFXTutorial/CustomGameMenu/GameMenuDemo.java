package JavaFXTutorial.CustomGameMenu;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameMenuDemo extends Application {

    private GameMenu gameMenu;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        root.setPrefSize(800, 600);

//        InputStream inputStream = Files.newInputStream(
//                Paths.get("/JavaFXTutorial/CustomGameMenu/MyBeautifulArt.jpg"));

        Image image = new Image("/JavaFXTutorial/CustomGameMenu/MyBeautifulArt.jpg");


//        inputStream.close();

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(800);
        imageView.setFitHeight(600);

        gameMenu = new GameMenu();
        gameMenu.setVisible(false);

        root.getChildren().addAll(imageView, gameMenu);

        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                if (!gameMenu.isVisible()) {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(0);
                    ft.setToValue(1);

                    gameMenu.setVisible(true);
                    ft.play();
                } else {
                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
                    ft.setFromValue(1);
                    ft.setToValue(0);

                    ft.setOnFinished(event1 -> gameMenu.setVisible(false));
                    ft.play();

                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class MenuButton extends StackPane {

        private Text text;

        public MenuButton(String name) {
            text = new Text(name);
            text.setFont(text.getFont().font(20));

            text.setFill(Color.WHITE);

            Rectangle bg = new Rectangle(250, 40);
            bg.setOpacity(0.6);
            bg.setFill(Color.BLACK);

            GaussianBlur blur = new GaussianBlur(3.5);

            bg.setEffect(blur);

            setAlignment(Pos.CENTER);
            setRotate(0.35);
            getChildren().addAll(bg, text);

            setOnMouseEntered(event -> {
                bg.setTranslateX(10);
                text.setTranslateY(7);
                bg.setFill(Color.WHITE);
                text.setFill(Color.BLACK);
            });

            setOnMouseExited(event -> {
                bg.setTranslateX(0);
                text.setTranslateY(0);
                bg.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });

            DropShadow dropShadow = new DropShadow(50, Color.WHITE);
            dropShadow.setInput(new Glow());

            setOnMousePressed(event -> setEffect(dropShadow));
            setOnMousePressed(event -> setEffect(null));

        }

    }

    private class GameMenu extends Parent {

        public GameMenu() {
            VBox menu0 = new VBox(15);
            VBox menu1 = new VBox(15);

            menu0.setTranslateX(100);
            menu0.setTranslateY(200);

            menu1.setTranslateX(100);
            menu1.setTranslateY(200);

            final int offset = 400;
            menu1.setTranslateX(offset);

            MenuButton btnResume = new MenuButton("RESUME");
            btnResume.setOnMouseClicked(event -> {
                FadeTransition ft = new FadeTransition(Duration.seconds(0.5), this);
                ft.setFromValue(1);
                ft.setToValue(0);
                ft.setOnFinished(event1 -> setVisible(false));
                ft.play();
            });


            MenuButton btnOptions = new MenuButton("OPTIONS");
            btnOptions.setOnMouseClicked(event -> {
                getChildren().add(menu1);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu0);
                tt.setToX(menu0.getTranslateX() - offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu1);
                tt1.setToX(menu0.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(event1 -> getChildren().remove(menu0));
            });


            MenuButton btnExit = new MenuButton("EXIT");
            btnExit.setOnMouseClicked(event -> System.exit(0));


            MenuButton btnBack = new MenuButton("BACK");
            btnBack.setOnMouseClicked(event -> {
                getChildren().add(menu0);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu1);
                tt.setToX(menu1.getTranslateX() + offset);

                TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), menu0);
                tt1.setToX(menu1.getTranslateX());

                tt.play();
                tt1.play();

                tt.setOnFinished(event1 -> getChildren().remove(menu1));
            });

            MenuButton btnSound = new MenuButton("SOUND");
            MenuButton btnVideo = new MenuButton("VIDEO");


            menu0.getChildren().addAll(btnResume, btnOptions, btnExit);
            menu1.getChildren().addAll(btnBack, btnSound, btnVideo);

            Rectangle bg = new Rectangle(800, 600);
            bg.setFill(Color.GREY);
            bg.setOpacity(0.4);

            getChildren().addAll(bg, menu0);
        }
    }
}
