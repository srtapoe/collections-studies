package br.studies.beginner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    private String name;
    private double price;
    private int qtde;

    @Override
    public String toString() {
        return "Product: [" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", qtde:" + qtde +
                ']' + "\n";
    }
}
