package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int result = X2.calc(a, b, c, x);
        int result1 = X2.calc(a1, b1, c1, x1);
        int result2 = X2.calc(a2, b2, c2, x2);
        int result3 = X2.calc(a3, b3, c3, x3);
        int result4 = X2.calc(a4, b4, c4, x4);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
