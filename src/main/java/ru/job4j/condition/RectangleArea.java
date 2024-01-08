package ru.job4j.condition;

/**
 * h = p / (2 * (k + 1));
 *
 * l = h * k;
 *
 * s = l * h;
 */

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}

