package launcher;

import domain.LeenRequest;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ui.StateUI;

public class Main extends Application {

    public static void main(String[] args) {
        //if javafx then launch, else make ProductUI
        StateUI p = new StateUI();
        //launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane root = new GridPane();
        StateUI ProductUI = new StateUI(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Labo ");
        primaryStage.show();
    }
}
