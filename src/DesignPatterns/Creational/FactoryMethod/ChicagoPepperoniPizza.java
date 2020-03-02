package DesignPatterns.Creational.FactoryMethod;

public class ChicagoPepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza is preparing for baking");
        try {
            Thread.sleep(1000);
            bake();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza in the oven and cook");
    }
}
