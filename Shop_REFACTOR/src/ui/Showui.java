package ui;

import domain.Game;
import domain.Movie;
import domain.Product;
import domain.Shop;

import javax.swing.*;

public class Showui {
    Shop shop;
    public Showui(){
        shop = new Shop();


        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
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
            }
        }
    }
    public void showMenu(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        String choiceString = JOptionPane.showInputDialog(menu);
    }

    public void addProduct(){
        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        Product p;
        if(type.equals("M")){
            p = new Movie(title,id);
        }else{
            p = new Game(title,id);
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
}
