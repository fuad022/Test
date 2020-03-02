package Projects;

public class FactorialTest {
    public static void main(String[] args) {
//        System.out.println("Loop: " + factorialLoop(8));
        System.out.println("Recursion: " + factRec(5));
    }

//    //Factorial with loop
//    private static int factorialLoop(int n) {
//        int fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }

    //Factorial with recursion
    private static int factRec(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factRec(n - 1);
    }
}
