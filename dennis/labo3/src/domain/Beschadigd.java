package domain;

public class Beschadigd implements ProductState {
    Product product;

    public Beschadigd(Product product){
        this.product = product;
    }
    @Override
    public void uitlenen() {
        System.out.println("Het product is beschadigd, gelieven het eerst te herstellen");
    }

    @Override
    public void verwijderen() {
        System.out.println("Product verwijderd");
        product.setState(product.getVerwijderd());
    }

    @Override
    public void terugbrengen() {
        System.out.println("Het product is terugbrengen maar is beschadigd.");

    }

    @Override
    public void terugbrengenBeschadigd() {
        System.out.println("Het product is terugbrengen maar is beschadigd.");
    }

    @Override
    public void herstellen() {
        System.out.println("Product Hersteld");
        product.setState(product.getUitleendbaar());
    }
}
