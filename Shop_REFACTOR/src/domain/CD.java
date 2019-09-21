package domain;

public class CD extends Product {
    public CD(String id, String title){
        super(id, title);
    }

    @Override
    public double getPrice(int dagen) {
        return dagen * 1.5;
    }

    @Override
    public String toString() {
        return "CD: " + this.getTitle() + " " + "id: " + this.getId();
    }
}
