package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputOfEuro = 140;
        float inputOfDollar = 300;
        float expectedAmountOfEuro = 2;
        float expectedAmountOfDollar = 5;
        float output1 = rubleToEuro(inputOfEuro);
        boolean passed1 = expectedAmountOfEuro == output1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        float output2 = rubleToDollar(inputOfDollar);
        boolean passed2 = expectedAmountOfDollar == output2;
        System.out.println("300 rubles are 5 dollar. Test result : " + passed2);
    }
}

