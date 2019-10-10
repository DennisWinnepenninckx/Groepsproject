package domain;

public class Uitleenbaar implements ProductState {
    private Product product;

    public Uitleenbaar(Product p){
        this.product = p;
    }
    @Override
    public void uitlenen() {
        product.setState(product.getUitgeleend());
    }

    @Override
    public void verwijderen() {
        product.setState(product.getVerwijderd());

    }

    @Override
    public void terugbrengen() {
        throw new DBException("Het product is niet uitgeleend");
    }

    @Override
    public void terugbrengenBeschadigd() {
        throw new DBException("Het product is niet uitgeleend");
    }

    @Override
    public void herstellen() {
        throw new DBException("Het product is niet beschadigd");
    }
    @Override
    public String toString() {
        return " uitleenbaar";
    }
}
