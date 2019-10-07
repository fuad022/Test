package Leetcode;

public class ReverseInteger {

    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            int a = x % 10;
            temp = temp * 10 + a;
            x = x / 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) return 0;

        return (int) temp;
    }

    public static void main(String[] args) {
        ReverseInteger rev = new ReverseInteger();
//        System.out.println(rev.reverse(1534236469));
        System.out.println(rev.reverse(-2147483648));
    }
}
