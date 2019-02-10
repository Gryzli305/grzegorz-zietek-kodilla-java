package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class BasicDeliveryOrder extends AbstractPizzaOrderDecorator{
    protected BasicDeliveryOrder(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }
    @Override
    public String getDescription() {
        return super.getDescription()+ " dostawa ";
    }
}
