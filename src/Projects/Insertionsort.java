package Projects;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
//        Integer[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before insertion sort: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

//        iSort(Arrays.stream(arr).mapToInt(Integer::intValue).toArray());
        iSort(arr);

        System.out.println("After insertion sort: ");
        System.out.println(Arrays.toString(arr));
    }

//    private static void iSort(Comparable arr[]) {
    private static void iSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
//            Comparable key = arr[i];
            int key = arr[i];
            int j = i - 1;

//            while (j >= 0 && arr[j].compareTo(key) > 0) {
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1; //j--;
            }
            arr[j + 1] = key;
        }
    }

//    private static void iSort(int arr[]) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1; //j--;
//            }
//            arr[j + 1] = key;
//        }
//    }
}
