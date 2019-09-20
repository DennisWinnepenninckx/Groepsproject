package domain;

public class Movie extends Product {
    public Movie(String id, String title) {
        super(id, title);
    }

    @Override
    public double getPrice(int dagen) {
        return dagen * 5;
    }
    @Override
    public String toString() {
        return "Movie: " + this.getTitle() + " " + "id: " + this.getId();
    }
}
