package Projects;

import java.util.Arrays;

public class Test23 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 8, 0, 5, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

                if (arr[j] != 0) {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

    }
}
