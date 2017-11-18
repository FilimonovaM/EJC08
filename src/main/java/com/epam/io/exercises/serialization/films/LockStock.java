package com.epam.io.exercises.serialization.films;

import com.epam.io.exercises.serialization.interfaces.Film;

import java.io.Serializable;

public class LockStock implements Film, Serializable {
    String name = "Lock, Stock and Two Smoking Barrels, 1998";
    String actors = "^[Jj]?a?s?o?n?\\w?[Ff]lemyng$|[Dd]?e?x?t?e?r? ?" +
            "[Ff]letcher|[Nn]?i?c?k? ?[Mm]oran|" +
            "[Jj]?a?s?o?n? ?[Ss]tatham|[Ss]?t?e?v?e?n? ?[Mm]ackintosh$";

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
