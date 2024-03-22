package br.studies.beginner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Character {

    private String name;
    private String serie;
    private int year;

    @Override
    public String toString() {
        return "Character: [" +
                "name: '" + name + '\'' +
                ", serie: '" + serie + '\'' +
                ", year: '" + year + '\'' +
                ']' + '\n';
    }
}
