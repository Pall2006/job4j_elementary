package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int destination) {
        int temp1 = array[source];
        for (int i = 0; i < array.length; i++) {
            if (i == source) {
                array[i] = array[destination];
            } else if (i == destination) {
                array[i] = temp1;
            }
        }
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}