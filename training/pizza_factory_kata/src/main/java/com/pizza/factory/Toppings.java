package com.pizza.factory;

import static com.pizza.factory.Freshness.FRESH;
import static com.pizza.factory.Freshness.OUTDATED;

public enum Toppings {

    //Cheeses
    MOZZARELLA(OUTDATED), RICOTTA(OUTDATED), FETA(OUTDATED), PARMESAN(OUTDATED), CHEDDAR(OUTDATED), MONTEREY(OUTDATED),
    //Vegetables
    CARROT(OUTDATED), TOMATOES(OUTDATED), MUSHROOMS(OUTDATED), ONIONS(OUTDATED), OLIVES(OUTDATED), BEANS(OUTDATED), PEPPERS(OUTDATED), SPINACH(OUTDATED),
    //Nuts
    ALMONDS(OUTDATED), PEANUTS(OUTDATED), PISTACHIOS(OUTDATED), PINE_NUTS(OUTDATED), WALNUTS(OUTDATED),
    //Herbs ann Spices :
    BASIL(OUTDATED), CORIANDER(OUTDATED), GARLIC(OUTDATED), OREGANO(OUTDATED), PEPPER(OUTDATED), ROSEMARY(OUTDATED),
    //Sea Food
    ANCHOVIES(OUTDATED), LOBSTER(OUTDATED), SHRIMPS(OUTDATED), SALMON(OUTDATED), SQUID(OUTDATED), TUNA(OUTDATED), OYSTERS(OUTDATED),
    //Meats
    BACON(OUTDATED), HAM(OUTDATED), SALAMI(OUTDATED), MEATBALLS(OUTDATED), DUCK(OUTDATED), CHICKEN(OUTDATED), BARBECUED_MEAT(OUTDATED),

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
