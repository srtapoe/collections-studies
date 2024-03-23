package br.studies.beginner.challenge3;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> supernatural = new ArrayList<>();
        supernatural.add("Dean");
        supernatural.add("Sam");
        supernatural.add("Castiel");
        supernatural.add("Bob");
        supernatural.add("Rowena");
        supernatural.add("Charlie");

        Iterator<String> iterator = supernatural.iterator();

        iterator.forEachRemaining(System.out::println);

    }
}
