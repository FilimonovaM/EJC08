package com.epam.io.exercises.serialization.films;

import com.epam.io.exercises.serialization.interfaces.Film;

import java.io.Serializable;

public class DarkShadows implements Film, Serializable {
    String name = "Dark Shadows, 2012";
    String actors = "[Jj]?o?h?n?n?y?\\w?[Dd]epp|[Mm]?i?c?h?e?l?l?e?\\w?[Pp]feiffer|" +
            "[Ee]?l?i?z?a?b?e?t?h?\\w?[Cc]?o?l?l?i?n?s?\\w?[Ss]toddard|" +
            "[Hh]?e?l?e?n?a?\\w?[Bb]?o?n?h?a?m?\\w?[Cc]arter|" +
            "[Ee]?v?a?\\w?[Gg]reen";

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
