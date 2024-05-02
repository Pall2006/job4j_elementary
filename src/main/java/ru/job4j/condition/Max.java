package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

    public static int max(int left, int right, int middle, int middle2) {
        return max(max(left, middle2), max(right, middle));
    }
}