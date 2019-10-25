package launcher;
	
import domain.Game;
import domain.Player;
import javafx.application.Application;
import javafx.stage.Stage;
import domain.PlayerView;
import domain.ScoreView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Game game = new Game();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		ScoreView sv1 = new ScoreView(game);
		PlayerView pv3 = new PlayerView("3", game);
		PlayerView pv2 = new PlayerView("2", game);
		PlayerView pv1 = new PlayerView("1", game);
		game.addObserver(pv1);
		game.addObserver(pv2);
		game.addObserver(pv3);
		game.addObserver(sv1);
		pv1.isAanBeurt(true);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
