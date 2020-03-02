package DesignPatterns.Creational.FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoClient {
    private static PizzaStore pizzaStore;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nChoose store for order pizza.\n" +
                           "1 - New York pizza store\n" +
                           "2 - California pizza store");
        int choice = Integer.parseInt(reader.readLine());
        choosePizzaStore(choice);

        System.out.print("Choose type of pizza: Cheese/Pepperoni: ");
        String pizzaType = reader.readLine();
        choosePizzaType(pizzaType);
    }

    private static void choosePizzaStore(int choice) {
        switch (choice) {
            case 1:
                pizzaStore = new NYPizzaStore();
                break;
            case 2:
                pizzaStore = new ChicagoPizzaStore();
                break;
            default:
                throw new IllegalArgumentException("Unknown store type " + choice);
        }
    }

    private static void choosePizzaType(String pizzaType) {
        pizzaStore.orderPizza(pizzaType);
    }
}
