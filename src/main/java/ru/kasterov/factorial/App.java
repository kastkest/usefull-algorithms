package ru.kasterov.factorial;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.factorial(4));
    }

    public int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            x = x * factorial(x - 1);
        }
        return x;
    }
}
