package com.pizza.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Menu {
    private final Set<Pizza> pizzas;

    public Menu(final Set<Pizza> pizzas) {
        this.pizzas = pizzas;

        List<Toppings> dan_magier_toppings = new ArrayList<>();
        dan_magier_toppings.add(Toppings.BACON);
        dan_magier_toppings.add(Toppings.BASIL);
        dan_magier_toppings.add(Toppings.MOZZARELLA);
        Pizza dan_magier_pizza = new Pizza("Dan MAGIER", dan_magier_toppings);
        pizzas.add(dan_magier_pizza);
    }

    public Set<Pizza> pizzas() {
        return pizzas;
    }
}
