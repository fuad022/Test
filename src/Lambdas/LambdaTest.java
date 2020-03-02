package Lambdas;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImpl implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class LambdaTest {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImpl()); // добавляем новый объект класса ExecutableImpl
        runner.run(new Executable() { // с помощью анонимного класса
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });
        runner.run(() -> System.out.println("Hello")); // с помощью лямбда-выражения
    }
}
