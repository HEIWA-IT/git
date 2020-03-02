package com.pizza.factory;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class PizzaFactoryTest {

    @Test
    public void should_delivered_the_order_of_one_fresh_pizza() {
        //ARRANGE
        Set<Pizza> pizzas = new HashSet<>();
        List<Toppings> freshToppings = new ArrayList<>();
        freshToppings.add(Toppings.BACON);
        freshToppings.add(Toppings.BASIL);
        freshToppings.add(Toppings.MOZZARELLA);
        Pizza freshPizza = new Pizza("Fresh pizza", freshToppings);
        pizzas.add(freshPizza);

        Menu menu = new Menu(pizzas);
        PizzaFactory pizzaFactory = new PizzaFactory(menu);

        List<Pizza> pizzasOrdered = new ArrayList<>();
        pizzasOrdered.add(freshPizza);

        //ACT
        Boolean isPizzaFresh = pizzaFactory.checkFreshnessOfThePizzasOrdered(pizzasOrdered);

        //ASSERT
        Assertions.assertThat(isPizzaFresh).isTrue();
    }

    @Test
    public void should_delivered_the_order_of_two_fresh_pizzas() {
        //ARRANGE
        Set<Pizza> pizzas = new HashSet<>();
        List<Toppings> freshToppingsList1 = new ArrayList<>();
        freshToppingsList1.add(Toppings.BACON);
        freshToppingsList1.add(Toppings.BASIL);
        freshToppingsList1.add(Toppings.MOZZARELLA);
        Pizza freshPizza1 = new Pizza("Fresh pizza 1", freshToppingsList1);
        pizzas.add(freshPizza1);

        List<Toppings> freshToppingsList2 = new ArrayList<>();
        freshToppingsList2.add(Toppings.SALAMI);
        freshToppingsList2.add(Toppings.BASIL);
        freshToppingsList2.add(Toppings.CHEDDAR);
        Pizza freshPizza2 = new Pizza("Fresh pizza 2", freshToppingsList2);
        pizzas.add(freshPizza2);

        Menu menu = new Menu(pizzas);
        PizzaFactory pizzaFactory = new PizzaFactory(menu);

        List<Pizza> pizzasOrdered = new ArrayList<>();
        pizzasOrdered.add(freshPizza1);
        pizzasOrdered.add(freshPizza2);

        //ACT
        Boolean arePizzasFresh = pizzaFactory.checkFreshnessOfThePizzasOrdered(pizzasOrdered);

        //ASSERT
        Assertions.assertThat(arePizzasFresh).isTrue();
    }

    @Test
    public void should_not_delivered_the_order_of_one_spoilt_pizza() {
        //ARRANGE
        Set<Pizza> pizzas = new HashSet<>();
        List<Toppings> toppingsWithSomeSpoiltOnes = new ArrayList<>();
        toppingsWithSomeSpoiltOnes.add(Toppings.BACON);
        toppingsWithSomeSpoiltOnes.add(Toppings.OUTDATED_TOMATOES);
        toppingsWithSomeSpoiltOnes.add(Toppings.MOZZARELLA);
        Pizza pizzaWithSomeSpoiltToppings = new Pizza("Spoilt pizza", toppingsWithSomeSpoiltOnes);
        pizzas.add(pizzaWithSomeSpoiltToppings);

        Menu menu = new Menu(pizzas);
        PizzaFactory pizzaFactory = new PizzaFactory(menu);

        List<Pizza> pizzasOrdered = new ArrayList<>();
        pizzasOrdered.add(pizzaWithSomeSpoiltToppings);

        //ACT
        Boolean isPizzaFresh = pizzaFactory.checkFreshnessOfThePizzasOrdered(pizzasOrdered);

        //ASSERT
        Assertions.assertThat(isPizzaFresh).isFalse();
    }

    @Test
    public void should_not_delivered_the_order_of_one_spoilt_pizza_and_one_fresh_pizza() {
        //ARRANGE
        Set<Pizza> pizzas = new HashSet<>();
        List<Toppings> toppingsWithSomeSpoiltOnes = new ArrayList<>();
        toppingsWithSomeSpoiltOnes.add(Toppings.BACON);
        toppingsWithSomeSpoiltOnes.add(Toppings.OUTDATED_TOMATOES);
        toppingsWithSomeSpoiltOnes.add(Toppings.MOZZARELLA);
        Pizza pizzaWithSomeSpoiltToppings = new Pizza("Spoilt pizza", toppingsWithSomeSpoiltOnes);
        pizzas.add(pizzaWithSomeSpoiltToppings);

        List<Toppings> freshToppings = new ArrayList<>();
        freshToppings.add(Toppings.BACON);
        freshToppings.add(Toppings.BASIL);
        freshToppings.add(Toppings.MOZZARELLA);
        Pizza freshPizza = new Pizza("Fresh pizza", freshToppings);
        pizzas.add(freshPizza);

        Menu menu = new Menu(pizzas);
        PizzaFactory pizzaFactory = new PizzaFactory(menu);

        List<Pizza> pizzasOrdered = new ArrayList<>();
        pizzasOrdered.add(pizzaWithSomeSpoiltToppings);
        pizzasOrdered.add(freshPizza);

        //ACT
        Boolean isPizzaFresh = pizzaFactory.checkFreshnessOfThePizzasOrdered(pizzasOrdered);

        //ASSERT
        Assertions.assertThat(isPizzaFresh).isFalse();
    }
}
