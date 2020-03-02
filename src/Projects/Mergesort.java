package Projects;

import java.util.Arrays;

public class Mergesort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (right <= left)
            return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        //вычисляем длину
        int lenghtLeft = mid - left + 1;
        int lenghtRight = right - mid;

        //создаем временные подмассивы
        int leftArray[] = new int[lenghtLeft];
        int rightArray[] = new int[lenghtRight];

        //копируем отсортированные массивы во временные
        for (int i = 0; i < lenghtLeft; i++)
            leftArray[i] = arr[left + i];
        for (int i = 0; i < lenghtRight; i++)
            rightArray[i] = arr[mid + i + 1];

        //итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        //копируем из leftArray и rightArray обратно в массиве
        for (int i = left; i < right + 1; i++) {
            //если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lenghtLeft && rightIndex < lenghtRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }

            //если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lenghtLeft) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            }
            //если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lenghtRight) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int[] intArr = {9, 8, 7, 6, 6, 5, 4, 3, 2, 2, 1};
        System.out.println("Before Sort = " + Arrays.toString(intArr));
        mergeSort(intArr, 5, 6);
        System.out.println("After Sort = " + Arrays.toString(intArr));
    }
}
