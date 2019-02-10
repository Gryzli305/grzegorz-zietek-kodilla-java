package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class DressingDecoration extends AbstractPizzaOrderDecorator {
    protected DressingDecoration(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "dodatkowy sos ";
    }
}
