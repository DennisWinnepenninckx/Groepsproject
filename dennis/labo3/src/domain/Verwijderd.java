package domain;

public class Verwijderd implements ProductState {

    private Product product;

    public Verwijderd(Product p){
        this.product = p;
    }

    @Override
    public void uitlenen() {
        throw new DBException("Het product is verwijderd");
    }

    @Override
    public void verwijderen() {
        throw new DBException("Het product is al verwijderd");

    }

    @Override
    public void terugbrengen() {
        throw new DBException("Het product is verwijderd");

    }

    @Override
    public void terugbrengenBeschadigd() {
        throw new DBException("Het product is verwijderd");

    }

    @Override
    public void herstellen() {
        throw new DBException("Het product is verwijderd");

    }
    @Override
    public String toString() {
        return " verwijderd";
    }
}
