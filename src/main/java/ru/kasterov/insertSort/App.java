package ru.kasterov.insertSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] testArr = {7, 3, 8, 8, 6, 9, 4, 11, 1};
        insertionSort(testArr);
        System.out.println(Arrays.toString(testArr));

    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }
}
