package domain;

public class Product {
    private String name;
    private double price;
    ProductState Beschadigd;
    ProductState Uitgeleend;
    ProductState Uitleenbaar;
    ProductState Verwijderd;

    ProductState state;


    public Product(String name,double aanschafprijs){
        Beschadigd = new Beschadigd(this);
        Uitgeleend = new Uitgeleend(this);
        Uitleenbaar = new Uitleenbaar(this);
        Verwijderd = new Verwijderd(this);
        state = Uitleenbaar;

        this.price = aanschafprijs;
        this.name = name;
    }
    void setState(ProductState state) {
        this.state = state;
    }

    public void uitlenen(){
        state.uitlenen();
    }

    public void verwijderen(){
        state.verwijderen();
    }
    public void herstellen(){
        state.herstellen();
    }
    public void terugbrengen(){
        state.terugbrengen();
    }
    public void terugbrengenBeschadigd(){
        state.terugbrengenBeschadigd();
    }

    public ProductState getState(){
        return state;
    }
    public ProductState getBeschadigd(){
        return Beschadigd;
    }

    public ProductState getUitgeleend() {
        return Uitgeleend;
    }

    public ProductState getUitleendbaar() {
        return Uitleenbaar;
    }

    public ProductState getVerwijderd() {
        return Verwijderd;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
}
