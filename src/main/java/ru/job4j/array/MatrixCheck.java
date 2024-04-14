package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column - 1] != ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}