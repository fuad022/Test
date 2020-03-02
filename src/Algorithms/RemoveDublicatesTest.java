package Algorithms;

import java.util.Arrays;

public class RemoveDublicatesTest {
    /*
    Как найти повторяющееся число в заданном массиве целых чисел?
     */

    public static void main(String[] args) {
//        int[][] test = new int[][]{
//                {1, 1, 2, 2, 3, 4, 5},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 2, 3, 4, 5, 6, 7},
//                {2, 1, 1, 1, 1, 1, 1}};

        int[] test = new int[]{1, 1, 2, 2, 3, 4, 5};

////        for (int[] input : test) {
//        for (int input : test) {
//            System.out.println("Array with duplicates : " + Arrays.toString(input));
//            System.out.println("After removing duplicates : " + Arrays.toString(removeDublicates(input)));
//        }
        System.out.println("Array with duplicates : " + Arrays.toString(test));
        System.out.println("After removing duplicates : " + Arrays.toString(removeDublicates(test)));
    }

    private static int[] removeDublicates(int[] numbersWithDublicates) {

        Arrays.sort(numbersWithDublicates);

        int[] result = new int[numbersWithDublicates.length];
        int previous = numbersWithDublicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDublicates.length; i++) {
            int ch = numbersWithDublicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }
}










