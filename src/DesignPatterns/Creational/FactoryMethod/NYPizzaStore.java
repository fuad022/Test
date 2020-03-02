package DesignPatterns.Creational.FactoryMethod;

/*Конкретные фабрики переопределяют фабричный метод и
возвращают из него собственные продукты.*/
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {  //factory method
        switch (type) {
            case "Cheese":
                return new NYCheesePizza();
            case "Pepperoni":
                return new NYPepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown ingredient type " + type);
        }
    }
}
