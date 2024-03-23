package br.studies.beginner.challenge3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square implements Form {
    private double out;

    @Override
    public double calculateArea() {
        return Math.pow(out, 2);
    }
}
