package DesignPatterns.Creational.FactoryMethod;

public class ChicagoCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Cheese pizza is preparing for baking");
        try {
            Thread.sleep(1000);
            bake();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza in the oven and cook");
    }
}
