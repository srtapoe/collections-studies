package br.studies.beginner;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Coffee", 3.50, 3);
        Product product2 = new Product("Rice", 10.50, 5);
        Product product3 =  new Product("Beans", 7.75, 8);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println("Size of list: " + products.size());
        System.out.println("Product:  " + products.get(1).toString());
        System.out.println("Full list: " + products);

    }
}
