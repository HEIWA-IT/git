package com.pizza.factory;

import static com.pizza.factory.Freshness.FRESH;
import static com.pizza.factory.Freshness.OUTDATED;

public enum Toppings {

    //Cheeses
    MOZZARELLA(FRESH), RICOTTA(FRESH), FETA(FRESH), PARMESAN(FRESH), CHEDDAR(FRESH), MONTEREY(FRESH),
    //Vegetables
    CARROT(FRESH), TOMATOES(FRESH), MUSHROOMS(FRESH), ONIONS(FRESH), OLIVES(FRESH), BEANS(FRESH), PEPPERS(FRESH), SPINACH(FRESH),
    //Nuts
    ALMONDS(FRESH), PEANUTS(FRESH), PISTACHIOS(FRESH), PINE_NUTS(FRESH), WALNUTS(FRESH),
    //Herbs ann Spices :
    BASIL(FRESH), CORIANDER(FRESH), GARLIC(FRESH), OREGANO(FRESH), PEPPER(FRESH), ROSEMARY(FRESH),
    //Sea Food
    ANCHOVIES(FRESH), LOBSTER(FRESH), SHRIMPS(FRESH), SALMON(FRESH), SQUID(FRESH), TUNA(FRESH), OYSTERS(FRESH),
    //Meats
    BACON(FRESH), HAM(FRESH), SALAMI(FRESH), MEATBALLS(FRESH), DUCK(FRESH), CHICKEN(FRESH), BARBECUED_MEAT(FRESH),

    //Outdated toppings
    OUTDATED_TOMATOES(OUTDATED);

    private Freshness freshness;

    Toppings(final Freshness freshness) {
        this.freshness = freshness;
    }

    public Boolean isFresh() {
        return (freshness() == FRESH) ? Boolean.TRUE : Boolean.FALSE;
    }

    public Freshness freshness() {
        return freshness;
    }
}
