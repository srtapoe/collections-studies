package br.studies.beginner.challenge4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Movie implements Comparable<Movie>{
    private String title;

    @Override
    public int compareTo(Movie movie) {
        return title.compareTo(movie.title);
    }
}
