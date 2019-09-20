package domain;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private ArrayList<Product> dbProduct;
    public Shop(){
        dbProduct = new ArrayList<>();
    }

    public void addProduct(Product p){
        if(p == null){
            throw new IllegalArgumentException("Product is null");
        }
        else{
            dbProduct.add(p); //geen check of product met dat id al inn db zit
        }
    }
    public Product getProduct(String id){
        if (id == null){
            throw new IllegalArgumentException("id is null");
        }else{
            Product p = null;
            for(Product x: dbProduct){
                if (x.getId().equals(id)){
                    return x;
                }
            }
            return null;
        }
    }
    public List<Product> getProducts(){
        return dbProduct;
    }
    public double getPrice(String id, int dagen){
        if (getProduct(id) == null){
            throw new IllegalArgumentException("Product bestaat niet");
        }else{
            Product p = getProduct(id);
            return p.getPrice(dagen);
        }
    }

    public void close(){
        return;
    }
}
