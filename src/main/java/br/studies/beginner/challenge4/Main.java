package br.studies.beginner.challenge4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1000, 5, 78, 1200, 59, 255, 750, 999);
        Collections.sort(numbers);
        numbers.forEach(System.out::println);
    }
}
