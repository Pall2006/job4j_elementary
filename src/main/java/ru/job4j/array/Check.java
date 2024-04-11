package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data.length == 1) {
                break;
            } else if (data[index] == data[index + 1]) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
