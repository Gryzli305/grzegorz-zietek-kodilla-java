package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        BigDecimal calculatedCost = theOrder.getCost();

        assertEquals(new BigDecimal(5),calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        String description =theOrder.getDescription();

        assertEquals("Drive a course ", description);
    }
    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(40),theCost);
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by Taxi Network",description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(37),theCost);
    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        String description = theOrder.getDescription();

        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(52), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
