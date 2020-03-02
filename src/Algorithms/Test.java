package Algorithms;

public class Test {
    public static void main(String[] args) {
        System.out.println(hello(null));
    }

    private static boolean hello(String s) {
        if ("hello".equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}
