package launcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ui.MainFX;

import static javafx.application.Application.launch;

public class MainLauncher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setHgap(50);
        root.setVgap(15);
        MainFX codingUIJavaFX = new MainFX(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Labo ");
        primaryStage.show();
    }
}
