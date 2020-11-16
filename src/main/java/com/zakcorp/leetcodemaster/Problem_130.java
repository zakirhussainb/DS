package com.zakcorp.leetcodemaster;

public class Problem_130 {
    static class Solver {
        public String[][] solve1(String[][] board) {
            for(int i = 1; i < board.length - 1; i++) {
                for(int j = 1; j < board[i].length - 1; j++) {
                    if(board[i][j].equals("O")) {
                        dfs(board, i, j);
                    }
                }
            }
            return board;
        }
        private void dfs(String[][] board, int r, int c) {
            if(r < 0 || c < 0 || r >= board.length || c >= board[r].length) {
                return;
            }
            // Check border values
            if(r == board.length - 1 && c == board[r].length - 1 && !board[r][c].equals("O")) {
                board[r][c] = "X";
            }
            dfs(board, r, c + 1);
            dfs(board, r + 1, c);
        }
    }
}
