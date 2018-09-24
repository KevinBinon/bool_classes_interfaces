package inheritance;

import java.util.List;

public class MyFavouritePizza extends AbstractPojoPizza {

    private String sauce;

    public MyFavouritePizza(String name, double price, List<String> toppings, String sauce) {
        super(name, price, toppings);
        this.sauce = sauce;
    }

    public String getSauce() {

        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
