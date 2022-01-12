package ru.kasterov.bubbleSort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] testArr = {7, 3, 8, 2, 6, 9, 4, 11, 1};
        bubbleSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
