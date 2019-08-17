package Projects;

public class Test9 {
    public static void main(String[] args) {
        int num = 1234;
        int revNum = 0;
        int temp;

        while (num > 0) {
            temp = num % 10;
            revNum = revNum * 10 + temp;
            num = num / 10;
        }
        System.out.println("Reversed number: " + revNum);
    }
}
