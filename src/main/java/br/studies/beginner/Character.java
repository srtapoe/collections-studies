package br.studies.beginner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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
