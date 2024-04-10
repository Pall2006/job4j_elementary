package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp2 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp2;
                }
            }
        }

        /* Вывод отсортированного массива */
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
