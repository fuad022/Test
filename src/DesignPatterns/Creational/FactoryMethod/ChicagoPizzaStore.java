package DesignPatterns.Creational.FactoryMethod;

/*Конкретные фабрики переопределяют фабричный метод и
возвращают из него собственные продукты.*/
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) { // factory method
        switch (type) {
            case "Cheese":
                return new ChicagoCheesePizza();
            case "Pepperoni":
                return new ChicagoPepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown type of pizza " + type);
        }
    }
}
