package com.epam.vol2.io.exercises.serialization.films;

import com.epam.vol2.io.exercises.serialization.interfaces.Film;

import java.io.Serializable;

public class GreatExpectation implements Film, Serializable {
    String name = "Great Expectations, 2012";
    String actors = "^J[j]?e?r?e?m?y?\\w?I[i]rvine|" +
            "[Hh]?o?l?l?i?d?a?y? ?[Gg]rainger|" +
            "[Rr]?a?l?p?h?\\w?[Ff]iennes|" +
            "[Hh]?e?l?e?n?a?\\w?[Bb]?o?n?h?a?m?[ -]?[Cc]arter|" +
            "[Rr]?o?b?b?i?e?\\w?[Cc]oltrane|" +
            "[Jj]?a?s?o?n?\\w?[Ff]lemyng$";

    /**
     * uses for getting the name of the film.
     *
     * @return name of the film.
     */
    @Override
    public String getFilmName() {
        return name;
    }

    /**
     * uses for getting the actors names in the regex format.
     *
     * @return regex with the valid variants of writing of the actors name.
     */
    @Override
    public String getActors() {
        return actors;
    }
}
