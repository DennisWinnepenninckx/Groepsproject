package domain;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerView implements Observer  {
	private Stage stage = new Stage();
	private Scene playerScene;
	private Label diceLabel; 
	private Button playButton; 
	private Label messageLabel;
	private Game game;
	
	private int spelerNummer;
	
	public PlayerView(String spelerNummer, Game game){
		this.spelerNummer = Integer.parseInt(spelerNummer);
		this.game =	game;
		diceLabel = new Label("Beurt 1: ");
		playButton = new Button("Werp dobbelstenen");
		playButton.setOnAction(new ThrowDicesHandler());
		playButton.setDisable(true);
		messageLabel = new Label("Spel nog niet gestart");
		layoutComponents();
		stage.setScene(playerScene);
		stage.setTitle("Speler "+spelerNummer);
		stage.setResizable(false);		
		stage.setX(100+(this.spelerNummer-1) * 350);
		stage.setY(200);
		stage.show();
	}

	private void layoutComponents() {
		VBox root = new VBox(10);
		playerScene = new Scene(root,250,100);
		root.getChildren().add(playButton);
		root.getChildren().add(diceLabel);
		root.getChildren().add(messageLabel);			
	}
	
	public void isAanBeurt(boolean aanBeurt){
		playButton.setDisable(!aanBeurt);		
	}

	@Override
	public void update() {
		int[] worp = game.getWorp();
		int behaaldeScore = game.getBehaaldeScore();
		int beurt = game.getBeurt();
		int huidigeSpeler = game.getVolgendeSpeler();
		Observer huidigeObserver = game.getObservers().get(huidigeSpeler);
		int vorigeSpeler = huidigeSpeler - 1;
		if (vorigeSpeler < 0){
			vorigeSpeler = game.getObservers().size()-1;
		}
		Observer vorigeObserver = game.getObservers().get(vorigeSpeler);
		diceLabel.setText("Beurt " + beurt + ":");
		if (this == huidigeObserver){
			isAanBeurt(true);
		}
		else if(this == vorigeObserver){
			isAanBeurt(false);
			messageLabel.setText(worp[0] + " en " + worp[1] + " - score:" + behaaldeScore);
		}
		else isAanBeurt(false);
	}

	class ThrowDicesHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            game.play();
        }
    }
}
