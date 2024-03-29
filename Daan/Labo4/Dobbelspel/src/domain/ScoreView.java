package domain;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScoreView implements Observer{
	private Game game;
	private Stage stage = new Stage();
	private Scene scoreScene;
	private Label scoreLabel;
	private int beurt;
		
	public ScoreView(Game game){
		this.game = game;
		this.beurt = 1;
		scoreLabel = new Label();
		scoreLabel.setStyle("-fx-font-family: \"Courier new\"; -fx-font-size: 12; -fx-text-fill: darkred;");

		layoutComponents();
		stage.setScene(scoreScene);
		stage.setTitle("Overzicht scores");
		stage.setResizable(false);		
		stage.setX(100);
		stage.setY(400);
		stage.show();
	}

	private void layoutComponents() {
		VBox root = new VBox();
		scoreScene = new Scene(root,400,200);
		root.getChildren().add(scoreLabel);
	}
	
	private void voegScoreLijnToe(String scoreLijn){
		scoreLabel.setText(scoreLabel.getText()+"\n"+scoreLijn);
	}

	@Override
	public void update() {
		voegScoreLijnToe("Beurt " + game.getBeurt() + "sp" + (game.getHuidigeSpeler()+1) + ", resultaat: " + game.getPlayers().get(game.getHuidigeSpeler()).getScore());
	}
}
