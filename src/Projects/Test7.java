package Projects;

public class Test7 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " even number.");
            } else {
                System.out.println(num[i] + " odd number.");
            }
        }
    }
}
