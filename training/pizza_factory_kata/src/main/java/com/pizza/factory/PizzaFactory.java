package com.pizza.factory;

import java.util.List;

public class PizzaFactory {

    private final Menu menu;

    public PizzaFactory(final Menu menu) {
        this.menu = menu;
    }

    public Menu menu() {
        return menu;
    }


    public boolean checkFreshnessOfThePizzasOrdered(List<Pizza> pizzasOrdered) {
        return pizzasOrdered.stream().allMatch(pizza -> pizza.isFresh(pizza.toppings()));
    }
}
