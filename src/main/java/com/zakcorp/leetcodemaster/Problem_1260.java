package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1260 {
    static class Solver {
        public List<List<Integer>> solve1(int[][] grid, int k) {
            List<List<Integer>> resultList = new ArrayList<>();
            int m = grid.length;
            int n = grid[0].length;
            while(k --> 0) {
                int x = grid[m - 1][n - 1];
                for (int i = m - 1; i >= 0; i--) {
                    for (int j = n - 1; j > 0; j--) {
                        grid[i][j] = grid[i][j - 1];
                    }
                    grid[i][0] = (i == 0) ? x : grid[i - 1][n - 1];
                }
            }
            for (int[] rows : grid) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    list.add(rows[j]);
                }
                resultList.add(list);
            }
            return resultList;
        }
        public List<List<Integer>> solve2(int[][] grid, int k) {
            List<List<Integer>> resultList = new ArrayList<>();
            int m = grid.length;
            int n = grid[0].length;
            while(k --> 0) {
                int x = grid[m - 1][n - 1];
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < n; j++) {
                        int temp = grid[i][j];
                        grid[i][j] = x;
                        x = temp;
                    }
                }
            }
            for(int[] rows : grid) {
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j < n; j++) {
                    list.add(rows[j]);
                }
                resultList.add(list);
            }
            return resultList;
        }
    }
}
