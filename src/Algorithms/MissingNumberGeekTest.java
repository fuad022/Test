package Algorithms;

public class MissingNumberGeekTest {

    private static void findMissingNumbers(int[] arr, int first, int last) {
        // before the array: numbers between first and a[0]-1
        for (int i = first; i < arr[0]; i++) {
            System.out.println(i);
        }
        // inside the array: at index i, a number is missing if it is between a[i-1]+1 and a[i]-1
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1 + arr[i - 1]; j < arr[i]; j++) {
                System.out.println(j);
            }
        }
        // after the array: numbers between a[a.length-1] and last
        for (int i = 1 + arr[arr.length - 1]; i <= last; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        findMissingNumbers(arr, 1, 10);
    }
}
