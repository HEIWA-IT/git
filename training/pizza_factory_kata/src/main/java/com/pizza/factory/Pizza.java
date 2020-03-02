package com.pizza.factory;

import java.util.List;

public class Pizza {

    private final String name;
    private final List<Toppings> toppings;

    public Pizza(final String name, final List<Toppings> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    public String name() {
        return name;
    }

    public List<Toppings> toppings() {
        return toppings;
    }

    public boolean isFresh(List<Toppings> toppings) {
        return toppings.stream().allMatch(topping -> topping.isFresh());
    }
}
