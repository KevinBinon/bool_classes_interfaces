package inheritance;

import java.util.List;

abstract class AbstractPojoPizza {
        private String name;
        private double price;
        private List<String> toppings;

        public AbstractPojoPizza() {
        }

        public AbstractPojoPizza(String name, double price, List<String> toppings) {
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
            return "this is a pizza "+getName()+" with following ingredients "+getToppings();
        }
}
