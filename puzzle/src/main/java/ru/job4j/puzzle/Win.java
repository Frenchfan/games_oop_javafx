package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        return (checkHorizontal(board) || checkVertical(board));
    }

    public static boolean checkVertical(int[][] board) {
        boolean result = true;
        for (int column = 0; column < board.length; column++) {
            result = true;
            for (int row = 0; row < board[column].length; row++) {
                if (board[row][column] != 1) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return result;
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = true;
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] != 1) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return result;
            }
        }
        return result;
    }
}
