package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_2428
{
    static class Solver {
        public int solve1(int[][] grid) {
            int maxSum = 0;
            for ( int i = 0; i < grid.length - 2; i++ ) {
                for(int j = 0; j < grid[0].length - 2; j++) {
                    int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] // To Calculate the "Top" of the Hour Glass
                        + grid[i + 1][j + 1] // To Calculate the "Belly" of the Hour Glass
                        + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]; // To Calculate the "Bottom" of the Hour Glass
                    maxSum = Math.max( maxSum, sum );
                }
            }
            return maxSum;
        }
    }
}
