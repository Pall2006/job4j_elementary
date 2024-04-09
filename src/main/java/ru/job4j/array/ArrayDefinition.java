package ru.job4j.array;

public class ArrayDefinition {
    short[] ages = new short[10];
    String[] surname = new String[100500];
    float[] prices = new float[40];

    public static void main(String[] args) {
        ArrayDefinition arrayDefinition = new ArrayDefinition();

        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sidr Sidorov";
        names[3] = "Сан Саныч";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
