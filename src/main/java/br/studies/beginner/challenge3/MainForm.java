package br.studies.beginner.challenge3;

import java.util.ArrayList;

public class MainForm {
    public static void main(String[] args) {
        ArrayList<Form> forms = new ArrayList<>();
        Circle circle = new Circle(5.0);
        Square square = new Square(6.0);
        forms.add(circle);
        forms.add(square);
        forms.forEach(form -> System.out.println(form.calculateArea()));

    }
}
