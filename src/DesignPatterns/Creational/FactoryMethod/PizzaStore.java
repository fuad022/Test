package DesignPatterns.Creational.FactoryMethod;

/*Базовый класс фабрики. Заметьте, что "фабрика" — это всего
лишь дополнительная роль для класса. Скорее всего, он уже
имеет какую-то бизнес-логику, в которой требуется создание
разнообразных продуктов.*/
public abstract class PizzaStore {

    public void orderPizza(String type) {
         /*Чтобы использовать фабричный метод, вы должны
         убедиться в том, что эта бизнес-логика не зависит от
         конкретных классов-продуктов. Pizza — это общий
         интерфейс пиц, поэтому все хорошо.*/
        Pizza pizza = createPizza(type);
        pizza.prepare();
    }

    /*Мы выносим весь код создания продуктов в особый метод,
    который назвают "фабричным".*/
    public abstract Pizza createPizza(String type);
}
