package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void getPeopleQuantity() {
        Country poland = new Country("Polska", new BigDecimal("100"));
        Country germany = new Country("Germany", new BigDecimal("150"));
        Country china = new Country("Chiny", new BigDecimal("250"));
        Country india = new Country("India", new BigDecimal("250"));
        Country usa = new Country("USA", new BigDecimal("150"));

   //     List<Country> europeCountry = Arrays.asList(poland,germany);
         //       europeCountry.add(poland);
         //       europeCountry.add(germany);


        Continent europa = new Continent("Europa", Arrays.asList(poland,germany));
        Continent asia = new Continent("Asia", Arrays.asList(china,india));
        Continent america = new Continent("America", Collections.singletonList(usa));

        World world = new World(Arrays.asList(europa,asia,america));
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("900"), peopleQuantity);
    }
}
