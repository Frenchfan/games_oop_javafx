package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        return (checkVertical(board) || checkHorizontal(board));
    }

    public static boolean checkVertical(int[][] board) {
        for (int j = 0; j < board.length; j++) {
            int vWin = 0;
            for (int i = 0; i < board[j].length; i++) {
                if (board[i][j] == 1) {
                    vWin++;
                }
            }
            if (vWin == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board) {
        for (int[] line : board) {
            int hWin = 0;
            for (int row : line) {
                if (row == 1) {
                    hWin++;
                }
            }
            if (hWin == 5) {
                return true;
            }
        }
        return false;
    }
}
