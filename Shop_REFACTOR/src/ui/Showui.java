package ui;

<<<<<<< HEAD
=======
import db.shopWriter;
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
import domain.*;

import javax.swing.*;
import java.util.ArrayList;

public class Showui {
    Shop shop;
    public Showui(){
        shop = new Shop();
        shopWriter writer = new shopWriter();

        //load file in db
        ArrayList<Product> products = (ArrayList<Product>) writer.readfile();
        if (products != null)
            shop.setDbProduct(products);

<<<<<<< HEAD
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Alle producten \n\n0. Quit";
=======
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Alle producten \n5. Verander beschikbaarheid\n\n0. Quit";
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct();
            } else if (choice == 2) {
                showProduct();
            } else if (choice == 3){
                showPrice();
            } else if (choice == 4){
                showProducts();
<<<<<<< HEAD
=======
            } else if(choice == 5){
                veranderBeschikbaarheid();
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
            }
        }
        writer.setProduct(shop.getProducts());
        writer.writeFile();

    }
    public void showMenu(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Alle producten \n\n0. Quit";
        String choiceString = JOptionPane.showInputDialog(menu);
    }

    public void addProduct(){
        String title = JOptionPane.showInputDialog("Enter the title:");
        //String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game/C for CD):");
        Product p;
        String id;
<<<<<<< HEAD
=======
        for(Product s:shop.getProducts()){
            System.out.println(s);
        }
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
        if (shop.getProducts().size() == 0)
            id = Integer.toString(1);
        else
            id = Integer.toString(Integer.parseInt(shop.getProducts().get(shop.getProducts().size()-1).getId()) + 1);

        if (shop.getProducts().size() != 0)
            System.out.println(shop.getProducts().get(shop.getProducts().size()-1));

        if(type.equals("M")){
            p = new Movie(id,title);
        }else if(type.equals("G")){
            p = new Game(id,title);
        }else{
            p = new CD(id,title);
        }
        shop.addProduct(p);
    }
    public void showProduct(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
            if(shop.getProduct(id).getId().equals(id))
            {
                found = true;
            }

        if(found)
        {
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getTitle());
        }
    }
    public void showProducts(){
        String antwoord ="";
        for(Product p: shop.getProducts()){
            if (p instanceof Movie)
                antwoord+=p+"\n";
        }
        for(Product p: shop.getProducts()){
            if (p instanceof Game)
                antwoord+=p+"\n";
        }for(Product p: shop.getProducts()){
            if (p instanceof CD)
                antwoord+=p+"\n";
        }

        JOptionPane.showMessageDialog(null, antwoord);

    }
    public void showPrice(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
            if(shop.getProduct(id) != null){
                found = true;
            }
        if(found){
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");
            int days = Integer.parseInt(daysString);
            System.out.println(shop.getProduct(id));
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getPrice(days));
        }
    }
    public void veranderBeschikbaarheid(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
        if(shop.getProduct(id).getId().equals(id))
        {
            found = true;
        }

        if(found)
        {
            shop.getProduct(id).changeBeschikbaar();
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getTitle() + " beschikbaarheid: " + shop.getProduct(id).isBeschikbaar());
        }
    }
}
