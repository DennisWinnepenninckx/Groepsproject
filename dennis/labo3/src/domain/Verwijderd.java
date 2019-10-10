package domain;

public class Verwijderd implements ProductState {

    private Product product;

    public Verwijderd(Product p){
        this.product = p;
    }

    @Override
    public void uitlenen() {
        System.out.println("Het product is verwijderd");
    }

    @Override
    public void verwijderen() {
        System.out.println("Het product is verwijderd");

    }

    @Override
    public void terugbrengen() {
        System.out.println("Het product is verwijderd");

    }

    @Override
    public void terugbrengenBeschadigd() {
        System.out.println("Het product is verwijderd");

    }

    @Override
    public void herstellen() {
        System.out.println("Het product is verwijderd");

    }
}
