package ru.kasterov.selectionSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {2, 15, -1, 4, 100, 54};
        App app = new App();
        app.selectionSort(array);
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

