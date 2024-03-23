package br.studies.beginner.challenge3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Animal max = (Animal) new Dog();

        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Rice", 12.50);
        Product product2 = new Product("Beans", 9.75);
        Product product3 = new Product("Sugar", 7.89);
        Product product4 = new Product("Bread", 8.00);
        Product product5 = new Product("Cake", 25.00);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        final double[] total = {0.00};

        products.forEach(product -> total[0] += product.getPrice());

        System.out.println("Total: " + total[0]);

    }
}
