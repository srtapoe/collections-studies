package br.studies.beginner;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> himym = Arrays.asList(
                new Character("Ted Mosby", "HIMYM", 2004),
                new Character("Barney Stinson", "HIMYM", 2004),
                new Character("Lily Aldrin", "HIMYM", 2004),
                new Character("Marshall Ericksen", "HIMYM", 2004),
                new Character("Robin Scherbatsky", "HIMYM", 2004));

            System.out.println(himym);
    }
}
