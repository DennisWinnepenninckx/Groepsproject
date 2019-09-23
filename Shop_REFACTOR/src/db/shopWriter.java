package db;

import domain.CD;
import domain.Game;
import domain.Movie;
import domain.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shopWriter {
    List<Product> Products;
    public shopWriter(){
    }

    public void setProduct(List<Product> Products){
        if (Products == null){
            throw new IllegalArgumentException("Ongeldige Products, products is null");
        }
        this.Products = Products;
    }
    public void writeFile(){
        try {
            Writer w = new FileWriter("shop.txt");
            for(Product p: Products){
                String content = p.toString() + "\n";
                w.write(content);
            }
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Product> readfile(){
        Product product;
        ArrayList<Product> result = new ArrayList<>();

        File file = new File("shop.txt");
        Scanner scannerFile = null;  		// scanner voor File
        try {
            scannerFile = new Scanner(file);

        while (scannerFile.hasNextLine()) {  				// voor elke lijn van het bestand
            Scanner scannerLijn = new Scanner(scannerFile.nextLine());  	// scanner voor lijn
            scannerLijn.useDelimiter(",");  				// scheidingstekens van verschillende delen in de huidige lijn
            String type = scannerLijn.next(); 			// eerste deel huidige lijn tot aan /

            String title = scannerLijn.next(); 				// tweede deel huidige lijn tot aan /
            title = title.split(":")[1];

            String id = scannerLijn.next();
            id = id.split(":")[1];

            String beschikbaarheid = scannerLijn.next();
            beschikbaarheid = beschikbaarheid.split(":")[1];
            boolean isbeschikbaar = Boolean.parseBoolean(beschikbaarheid);

            if(type.equals("Movie")){
                product = new Movie(id,title,isbeschikbaar);
            }else if(type.equals("CD")){
                product = new CD(id,title,isbeschikbaar);

            }else{
                product = new Game(id,title,isbeschikbaar);
            }
            result.add(product);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
