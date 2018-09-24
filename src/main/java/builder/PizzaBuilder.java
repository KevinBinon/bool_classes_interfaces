package builder;

import accessability_mutability.SimplePojoPizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String name;
    private double price;
    private List<String> toppings= new ArrayList<>();

    public PizzaBuilder() {

    }

    public PizzaBuilder withName(String name){
        this.name=name;
        return this;
    }

    public PizzaBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public PizzaBuilder withToppings(String ... toppings) {
        for (String topping : toppings) {
            this.toppings.add(topping);
        }
        return this;
    }

    public SimplePojoPizza build() {
        SimplePojoPizza simplePojoPizza = new SimplePojoPizza();
        simplePojoPizza.setName(this.name);
        simplePojoPizza.setPrice(this.price);
        simplePojoPizza.setToppings(this.toppings);

        return simplePojoPizza;
    }
}
