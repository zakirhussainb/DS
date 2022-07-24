package com.zakcorp.leetcodemaster.contest;

public class Problem_B {
    static class Solver {
        public int solve1(int[][] grid) {
            int n = grid.length; // grid size

            int ans = 0; // final answer

            for (int i = 0; i < n; i++) {
                // ith row
                for (int j = 0; j < n; j++) {
                    // jth column
                    int count = 0;

                    for (int k = 0; k < n; k++) {
                        if (grid[i][k] == grid[k][j])
                            count++;
                    }

                    // check if row and column are equal
                    if (count == n)
                        ans++;
                }
            }

            return ans;
        }
    }
}