package Projects;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Before bubble sort: " + Arrays.toString(arr));
        bSort(arr);
        System.out.println("After bubble sort: " + Arrays.toString(arr));
    }

    private static void bSort(int arr[]) {
        int n = arr.length;
//        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
