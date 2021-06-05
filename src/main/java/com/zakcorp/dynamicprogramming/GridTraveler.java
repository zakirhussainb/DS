package com.zakcorp.dynamicprogramming;

/**
 * Created by Zakir Hussain B on 02/01/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: Grid Traveler
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/unique-paths/
 * @pseudocode:
 */
public class GridTraveler {
    // Refer Problem 62 from leetcodemaster
    static class Solver {
        public int solve1(int m, int n) {
            int[][] dp = new int[m + 1][n + 1];
            dp[1][1] = 1;
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    int val = dp[i][j];
                    if(i + 1 <= m) {
                        dp[i + 1][j] += val;
                    }
                    if(j + 1 <= n) {
                        dp[i][j + 1] += val;
                    }
                }
            }
            return dp[m][n];
        }
    }
}