package domain;

public class Uitgeleend implements ProductState {
    private Product product;
    public Uitgeleend(Product p){
        this.product = p;
    }
    @Override
    public void uitlenen() {
        System.out.println("Het product is al uitgeleend");
    }

    @Override
    public void verwijderen() {
        System.out.println("Het product is uitgeleend");
    }

    @Override
    public void terugbrengen() {
        System.out.println("terugbrengen. . .");
        product.setState(product.getUitleendbaar());
    }

    @Override
    public void terugbrengenBeschadigd() {
        System.out.println("Terugbrengen maar beschadigd. . . schadenvergoeding €" + product.getPrice()/3);
        product.setState(product.getBeschadigd());
    }

    @Override
    public void herstellen() {
        System.out.println("Het product is uitgeleend");
    }
}
