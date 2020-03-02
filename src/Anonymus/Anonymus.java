package Anonymus;

interface AbleToEat {
    void eat();
}

public class Anonymus {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Eat");
            }
        };

        ableToEat.eat();
    }
}
