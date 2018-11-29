package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBurgerNew() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.WITH_SEZAME)
                .burgers(2)
                .sauce(SauceType.STANDARD)
                .ingredients(IngredientsType.BACON)
                .ingredients(IngredientsType.ONION)
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertFalse(bigmac.getIngredients().contains(IngredientsType.CHILI_PEPPERS));
    }
}
