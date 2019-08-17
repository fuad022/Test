package Eolymp;

public class TwoFactors {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.print(i);
        i = i++;
        System.out.println(i);


//        int k = 3;
//        System.out.println(demin(k));
    }

    private static int demin(int k) {

        int qnty_deconst = 1, mnoji = 2, num = k * k;
        if (k == 1) return 1;
        while (true) {
            if (num % mnoji == 0) {
                qnty_deconst++;
                if (qnty_deconst == k) return num;
            }
            mnoji++;
            if ((mnoji * mnoji) >= num) {
                num++;
                mnoji = 2;
                qnty_deconst = 1;
            }
        }
    }
}
