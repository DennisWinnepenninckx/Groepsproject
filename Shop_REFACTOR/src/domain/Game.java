package domain;

public class Game extends Product {
    public Game(String id, String title) {
        super(id, title);
    }
    public Game(String id, String title,boolean b){
        super(id, title,b);
    }
    @Override
    public double getPrice(int dagen) {
        return dagen * 3;
    }

    @Override
    public String toString() {
        return "Game," + super.toString();
    }
}
