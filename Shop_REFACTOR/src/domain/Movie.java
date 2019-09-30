package domain;

public class Movie extends Product {
    public Movie(String id, String title) {
        super(id, title);
    }
    public Movie(String id, String title,boolean b){
        super(id, title,b);
    }
    @Override
    public double getPrice(int dagen) {
        return dagen * 5;
    }
    @Override
    public String toString() {
        return "Movie," + super.toString();
    }

}
