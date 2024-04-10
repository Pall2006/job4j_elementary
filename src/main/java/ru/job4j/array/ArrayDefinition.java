package ru.job4j.array;

public class ArrayDefinition {
    short[] ages = new short[10];
    String[] surname = new String[100500];
    float[] prices = new float[40];

    public static void main(String[] args) {
        ArrayDefinition arrayDefinition = new ArrayDefinition();
        System.out.println("Размер массива ages: " + arrayDefinition.ages.length);
        System.out.println("Размер массива surname: " + arrayDefinition.surname.length);
        System.out.println("Размер массива prices: " + arrayDefinition.prices.length);
    }
}
