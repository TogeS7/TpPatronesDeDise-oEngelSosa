package builder;
public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder conMasa(String masa) {
        pizza.setMasa(masa);
        return this; 
    }

    public PizzaBuilder conSalsa(String salsa) {
        pizza.setSalsa(salsa);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}