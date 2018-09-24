package accessability_mutability;

public class SimplePojoPizza {
//    Create a pizza class it should have a name, price, list with toppings, ...
//    Make this class restrict accessability as much as possible
//    Make this class immutable

    private String name;
    private double price;
    private String[] toppings;

    public SimplePojoPizza(String name, double price, String[] toppings) {

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

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}
