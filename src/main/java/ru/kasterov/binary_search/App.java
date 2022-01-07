package ru.kasterov.binary_search;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.printArray(app.createArray());
        System.out.println();
        System.out.println(app.binarySearch(app.createArray(), 30));
    }

    public int[] createArray() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == element) {
                return mid;
            } else if (guess > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
