package br.studies.beginner.challenge4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMovie {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        Movie interestellar = new Movie("Interestellar");
        Movie oneDay = new Movie("One Day");
        Movie titanic = new Movie("Titanic");
        Movie avatar = new Movie("Avatar");
        Movie fightClub = new Movie("Fight Club");

        movies.add(interestellar);
        movies.add(oneDay);
        movies.add(titanic);
        movies.add(avatar);
        movies.add(fightClub);

        Collections.sort(movies);
        movies.forEach(movie -> System.out.println(movie.getTitle()));
    }
}
