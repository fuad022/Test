package Abstract;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public abstract void display();
}
