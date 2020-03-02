package Projects;

public class FibonacciTest {
    //Fibonacci algorithm
    public static void main(String[] args) {
//        System.out.println("fibonacciSpaceOptimized: " + fibonacciSpaceOptimized(10));
        System.out.println("fibonacciRecursion: " + fibonacciRecursion(30));
    }

    private static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

//    private static int fibonacciSpaceOptimized(int n) {
//        int a = 0;
//        int b = 1;
//        int c;
//
//        if (n <= 1) {
//            return n;
//        }
//
//        for (int i = 2; i <= n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        return b;
//    }
}
