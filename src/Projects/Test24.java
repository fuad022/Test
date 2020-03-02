package Projects;

public class Test24 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30);
        h1.print();
        h2.print();
        Human h3 = new Human("Mike", 20);
        h3.print();
    }
}

class Human {
    private String name;
    private int age;

    private static int count;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Number: " + count);
    }
}
