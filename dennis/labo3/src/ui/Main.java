package ui;

import domain.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product p = new Product("product",5);
        p.uitlenen();
        p.terugbrengenBeschadigd();
    }
}
