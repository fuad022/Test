package Projects;

import java.util.Arrays;

public class Heapify {

    static void heapify(int[] arr, int length, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;

        //если левый дочерний больше родительского
        if (leftChild < length && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        //если правый дочерний больше родительского
        if (rightChild < length && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        //если должна произойти замена
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, length, largest);
        }
    }

    public static void heapSort(int[] arr) {
        if (arr.length == 0)
            return;

        //строим кучу
        int length = arr.length;
        //проходим от первого без ответвлений к корню
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(arr, length, i);

        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int[] intArr = {9, 8, 7, 6, 6, 5, 4, 3, 2, 2, 1};
        System.out.println("Before Sort = " + Arrays.toString(intArr));
        heapify(intArr, 5, 6);
        System.out.println("After Sort = " + Arrays.toString(intArr));
    }
}
