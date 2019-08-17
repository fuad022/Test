package Projects;

import java.util.Arrays;

public class Selectionsort {

    public static void sort(Comparable[] input) {
        int inputLength = input.length; // value length
        for (int i = 0; i < inputLength; i++) {
            int small = i; // index of smallest value

            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j].compareTo(input[small]) < 0) {
                    small = j;
                }
            }

            // swaps the smallest value with the position 'i'
            Comparable temp = input[i];
            input[i] = input[small];
            input[small] = temp;
        }
    }

    public static void main(String[] args) {
//        String[] strArr = {"S", "E", "L", "E", "C", "T", "I", "O", "N", "S", "O", "R", "T"};
//        System.out.println("Before Sort = " + Arrays.toString(strArr));
//        sort(strArr);
//        System.out.println("After Sort = " + Arrays.toString(strArr));

        System.out.println();
        Integer[] intArr = {9, 8, 7, 6, 6, 5, 4, 3, 2, 2, 1};
        System.out.println("Before Sort = " + Arrays.toString(intArr));
        sort(intArr);
        System.out.println("After Sort = " + Arrays.toString(intArr));
    }
}
