package Lambdas;

interface Executable2 {
    int execute(int x, int y);
}

class Runner2 {
    public void run(Executable2 e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class LambdaTestInt {
    public static void main(String[] args) {
        Runner2 runner2 = new Runner2();

        runner2.run(new Executable2() {
            @Override
            public int execute(int x, int y) {
                return x + y;
            }
        });

        runner2.run((x, y) -> x + y);
    }
}
