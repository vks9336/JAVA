package com.Recursion_in_JAVA;

public class SudokuSolver {
    public static boolean sudokuSolver(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch <= '9'; ch++){
                        if(isValid(i, j, ch, board)) {
                            board[i][j] = ch;
                            if(sudokuSolver(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int row, int col, char ch, char[][] board) {
        for(int i = 0; i < 9; i++){
            if(board[i][col] == ch || board[row][i] == ch ||
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == ch){
                return false;
            }
        }
        return true;
    }

    public static void display(char[][] board){
        System.out.println("[ ");
        for (int i = 0; i < board.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf(" %c ",board[i][j]);
            }
            System.out.print(" ]");
            System.out.println();
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean ans = sudokuSolver(board);
        if(ans){
            System.out.println("Your given sudoku is a valid sudoku.");
        }
        else System.out.println("Your provided sudoku is not valid.");
//        display(board);
    }
}
