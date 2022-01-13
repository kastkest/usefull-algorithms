package ru.kasterov.sortingShell;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] testArr = {7, 3, 8, 8, 6, 9, 4, 11, 1};
        sortBySelect(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    public static void sortBySelect(int[] array) {
        int length = array.length;
        int step = length / 2;
        while (step > 0) {
            for (int numberOfGroup = 0; numberOfGroup < length - step; numberOfGroup++) {
                int j = numberOfGroup;
                while (j >= 0 && array[j] > array[j + step]) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
    }
}
