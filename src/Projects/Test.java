package Projects;

public class Test {
    public static void main(String[] args) {
        System.out.println("Loop: " + factorialLoop(8));
        System.out.println("Recursion: " + factorialRecursion(3));
    }

    //Factorial with loop
    private static int factorialLoop(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //Factorial with recursion
    private static int factorialRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialRecursion(n - 1);
    }
}
