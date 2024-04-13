package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{5}, {3, 9}, {2, 6, 8}, {1, 3, 7, 8}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива равен: " + numbers[index].length);
        }
    }
}
