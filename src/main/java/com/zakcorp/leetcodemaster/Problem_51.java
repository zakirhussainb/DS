package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem_51 {
    // Good Solution, but we need more efficient one
    static class Solver {
        public List<List<String>> solve1(int n) {
            List<List<String>> res = new ArrayList<>();
            char[][] board = new char[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
            backtrack(0, board, res);
            return res;
        }
        private void backtrack(int col, char[][] board, List<List<String>> res) {
            if(col == board.length) {
                res.add(constructOutputBoard(board));
                return;
            }
            for(int row = 0; row < board.length; row++) {
                if(isSafe(row, col, board)) {
                    board[row][col] = 'Q';
                    backtrack(col + 1, board, res);
                    board[row][col] = '.';
                }
            }
        }

        private boolean isSafe(int row, int col, char[][] board) {
            int tempRow = row;
            int tempCol = col;

            // Check for Left Row
            while(col >= 0) {
                if(board[row][col] == 'Q')
                    return false;
                col--;
            }

            col = tempCol;
            // Check for Lower Diagonal on the Left Side
            while(row < board.length && col >= 0) {
                if(board[row][col] == 'Q')
                    return false;
                row++;
                col--;
            }

            row = tempRow;
            col = tempCol;
            // Check for Upper Diagonal on the Left Side
            while(row >= 0 && col >= 0) {
                if(board[row][col] == 'Q')
                    return false;
                row--;
                col--;
            }
            return true;
        }

        private List<String> constructOutputBoard(char[][] board) {
            List<String> list = new LinkedList<>();
            for (char[] chars : board) {
                list.add(new String(chars));
            }
            return list;
        }
    }

    static class Solver1 {
        public List<List<String>> solve1(int n) {
            List<List<String>> res = new ArrayList<>();
            char[][] board = new char[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
            boolean[] leftRow = new boolean[n];
            boolean[] lowerDiagonal = new boolean[2 * n - 1];
            boolean[] upperDiagonal = new boolean[2 * n - 1];
            backtrack(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
            return res;
        }

        private void backtrack(int col, char[][] board, List<List<String>> res, boolean[] leftRow, boolean[] lowerDiagonal,
                               boolean[] upperDiagonal) {
            if(col == board.length) {
                res.add(constructOutputBoard(board));
                return;
            }
            for(int row = 0; row < board.length; row++) {
                if( !leftRow[row] && !lowerDiagonal[row + col] && !upperDiagonal[board.length - 1 + col - row] ) {
                    board[row][col] = 'Q';
                    leftRow[row] = true;
                    lowerDiagonal[row + col] = true;
                    upperDiagonal[board.length - 1 + col - row] = true;

                    backtrack(col + 1,board, res, leftRow, lowerDiagonal, upperDiagonal);

                    board[row][col] = '.';
                    leftRow[row] = false;
                    lowerDiagonal[row + col] = false;
                    upperDiagonal[board.length - 1 + col - row] = false;
                }
            }
        }

        private List<String> constructOutputBoard(char[][] board) {
            List<String> list = new LinkedList<>();
            for (char[] chars : board) {
                list.add(new String(chars));
            }
            return list;
        }
    }
}
