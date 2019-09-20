package domain;

public class Game extends Product {
    public Game(String id, String title) {
        super(id, title);
    }

    @Override
    public double getPrice(int dagen) {
        return dagen * 3;
    }

    @Override
    public String toString() {
        return "Game: " + this.getTitle() + " " + "id: " + this.getId();
    }
}
