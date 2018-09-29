package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
       return continents.stream()
               .flatMap(l -> l.getCountries().stream())
               .map(l -> l.getPeopleQuantity())
               .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
