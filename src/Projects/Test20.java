package Projects;

import java.util.*;

public class Test20 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);
        Animal animal3 = new Animal(3);
        Animal animal4 = new Animal(4);

        Queue<Animal> animals = new LinkedList<>();
        animals.add(animal3);
        animals.add(animal2);
        animals.add(animal4);
        animals.add(animal1);

        for (Animal a : animals)
            System.out.println(a);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}