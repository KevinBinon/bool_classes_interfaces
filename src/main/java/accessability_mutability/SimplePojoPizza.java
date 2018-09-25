package accessability_mutability;

import builder.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class SimplePojoPizza {
//    Create a pizza class it should have a name, price, list with toppings, ...
//    Make this class restrict accessability as much as possible
//    Make this class immutable

    public String name;
    public double price;
    public List<String> toppings;

    public SimplePojoPizza() {
    }

    public SimplePojoPizza(String name, double price, List<String> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "this is a pizza " + getName() + " with following ingredients " + getToppings();
    }

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        SimplePojoPizza a = pizzaBuilder.withName("Margheritta").withPrice(10.0).withToppings("a", "b").build();
        System.out.println(a.toString());
    }
}

