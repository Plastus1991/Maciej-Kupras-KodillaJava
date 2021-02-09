package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;


public final class World {


    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public Set<Continent> getContinents() {
        return continents;
    }
}





