package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem_51 {
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
}
