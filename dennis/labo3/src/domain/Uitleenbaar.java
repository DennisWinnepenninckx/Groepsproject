package domain;

public class Uitleenbaar implements ProductState {
    private Product product;

    public Uitleenbaar(Product p){
        this.product = p;
    }
    @Override
    public void uitlenen() {
        System.out.println("product uitlenen voor €" + product.getPrice()/5);
        product.setState(product.getUitgeleend());
    }

    @Override
    public void verwijderen() {
        System.out.println("Product verwijderen");
        product.setState(product.getVerwijderd());

    }

    @Override
    public void terugbrengen() {
        System.out.println("Het product is niet uitgeleend");
    }

    @Override
    public void terugbrengenBeschadigd() {
        System.out.println("Het product is niet uitgeleend");
    }

    @Override
    public void herstellen() {
        System.out.println("Het product is niet beschadigd");
    }
}
