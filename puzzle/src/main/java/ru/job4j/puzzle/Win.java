package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkVertical(board) || checkHorizontal(board);
    }
    public static boolean checkVertical(int[][] board) {
        for (int j = 0; j < board.length; j++) {
            int vWin = 0;
            for (int i = 0; i < board[j].length; i++) {
                if (board[i][j] == 1) {
                    vWin++;
                }
            }
            if (vWin == 5) return true;
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int hWin = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    hWin++;
                }
            }
            if (hWin == 5) return true;
        }
        return false;
    }
}
