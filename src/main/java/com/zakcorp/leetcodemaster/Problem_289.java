package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_289 {
    static class Solver {
        /*
        live cell -> live neighbour count less than 2 -> dies
        live cell -> live neighbour count >= 2 -> lives on
        live cell -> live neighbour count > 3 -> dies
        dead cell -> live neighbour count == 3 -> becomes live
        */
        public int[][] solve1(int[][] board) {
            int m = board.length;
            int n = board[0].length;
            int[][] tempBoard = new int[m][n];
            // Create a copy of the original board
            for (int row = 0; row < m; row++) {
                System.arraycopy(board[row], 0, tempBoard[row], 0, n);
            }
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    int liveNeighbourCount = getLiveNeighbourCount(tempBoard, i, j, m, n);
                    if(tempBoard[i][j] == 1) {
                        if(liveNeighbourCount < 2 || liveNeighbourCount > 3) {
                            board[i][j] = 0;
                        }
                    } else {
                        if(liveNeighbourCount == 3) {
                            board[i][j] = 1;
                        }
                    }
                }
            }
            return board;
        }
        private int getLiveNeighbourCount(int[][] board, int i, int j, int m, int n) {
            int count = 0;
            if(j + 1 <= n - 1 && board[i][j + 1] == 1)
                count++;
            if(j - 1 >= 0 && board[i][j - 1] == 1)
                count++;
            if(i + 1 <= m - 1 && board[i + 1][j] == 1)
                count++;
            if(i - 1 >= 0 && board[i - 1][j] == 1)
                count++;
            if(i - 1 >= 0 && j + 1 <= n - 1 && board[i - 1][j + 1] == 1)
                count++;
            if(i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1)
                count++;
            if(i + 1 <= m - 1 && j + 1 <= n - 1 && board[i + 1][j + 1] == 1)
                count++;
            if(i + 1 <= m - 1 && j - 1 >= 0 && board[i + 1][j - 1] == 1)
                count++;
            return count;
        }
    }
}
