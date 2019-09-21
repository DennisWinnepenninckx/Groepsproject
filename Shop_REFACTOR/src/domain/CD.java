package domain;

public class CD extends Product {
    public CD(String id, String title){
        super(id, title);
    }
    public CD(String id, String title,boolean b){
        super(id, title,b);
    }

    @Override
    public double getPrice(int dagen) {
        return dagen * 1.5;
    }

    @Override
    public String toString() {
        return "CD," + super.toString();
    }
}
