package com.zakcorp.leetcodemaster;

public class Problem_37 {
    static class Solver {
        public char[][] solve1(char[][] board) {
            sudokuSolver(board);
            return board;
        }
        private boolean sudokuSolver(char[][] board) {
            for(int r = 0; r < board.length; r++) {
                for(int c = 0; c < board[0].length; c++) {
                    if(board[r][c] == '.') {
                        for(char digit = '1'; digit <= '9'; digit++) {
                            if(isValid(r, c, board, digit)) {
                                board[r][c] = digit;
                                if(sudokuSolver(board))
                                    return true;
                                else
                                    board[r][c] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        private boolean isValid(int row, int col, char[][] board, char digitToBePlaced) {
            for(int index = 0; index < 9; index++) {
                // Check for the entire row
                if(board[row][index] == digitToBePlaced)
                    return false;
                // Check for the entire column
                if(board[index][col] == digitToBePlaced)
                    return false;
                // Check for the 3 * 3 sub-matrix
                if(board[3 * (row / 3) + (index / 3)][3 * (col / 3) + (index % 3)] == digitToBePlaced)
                    return false;
            }
            return true;
        }
    }
}
