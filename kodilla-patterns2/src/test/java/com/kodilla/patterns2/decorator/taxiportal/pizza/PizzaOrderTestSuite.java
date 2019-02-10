package com.kodilla.patterns2.decorator.taxiportal.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicDeliveryGetCost() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicDeliveryOrder(theOrder);

        BigDecimal calculatedCost = theOrder.getCost();

        assertEquals(new BigDecimal(20),calculatedCost);
    }

    @Test
    public void testFreeDeliveryGetCost() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new FreeDelivery(theOrder);

        BigDecimal calculatedCost = theOrder.getCost();

        assertEquals(new BigDecimal(15),calculatedCost);
    }
    @Test
    public void testBaconOrder() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BaconDecorator(theOrder);


        String description = theOrder.getDescription();
        System.out.println(description);

        assertEquals(description,"Ciasto, sos pomidorowy, ser bekon ");
    }
    @Test
    public void testManyDeco() {
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new DressingDecoration(theOrder);
        theOrder = new BasicDeliveryOrder(theOrder);

        BigDecimal calculatedCost = theOrder.getCost();

        assertEquals(new BigDecimal(27.5),calculatedCost);


    }



}
