package br.studies.beginner.challenge3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Circle implements Form {
    private double out;

    @Override
    public double calculateArea() {
        double PI = Math.PI;
        return PI * Math.pow(out, 2);
    }
}
