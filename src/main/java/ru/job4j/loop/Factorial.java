package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result;
        if (number == 0) {
            result = 1;
        } else {
            result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }
}

