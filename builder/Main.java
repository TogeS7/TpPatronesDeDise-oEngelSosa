package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
            .conMasa("Fina")
            .conSalsa("Tomate")
            .build();

        System.out.println(pizza);
    }
}