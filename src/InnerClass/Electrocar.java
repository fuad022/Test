package InnerClass;

public class Electrocar {
    private int id;

    public Electrocar(int id) {
        this.id = id;
    }

    // вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //локальный вложенный класс
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();
        test(someClass);
    }

    private void test(Object o) {
        System.out.println("test method " + o);
    }
}
