package Polymorfism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();
        dog.eat();
        cat.eat();

//        test(animal);
//        test(dog);
//        test(cat);
//////////////////////////////////////////////
//        Animal animal = new Dog();
//        //позднее связывание(динамическое связывание)
//        animal.eat();
//
////        animal.eat();
////        animal.bark();
////
////        Dog dog = new Dog();
////        dog.eat();
////        dog.bark();
    }

    private static void test(Animal animal) {
        animal.eat();
    }
}
