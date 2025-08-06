package com.zakcorp.striver_series.dp.twodimensional;

import java.util.Arrays;

public class DP_Ninja_Training {
    static class Recursion {
        public int solve1(int[][] matrix) {
            int m = matrix.length;
            int n = 3;
            return recur(0, 3, matrix, m, n);
        }
        private int recur(int day, int act, int[][] matrix, int m, int n) {
            if(day >= m) {
                return 0;
            }

            int maxPoints = 0;
            for(int nextAct = 0; nextAct < n; nextAct++) {
                if(nextAct != act) {
                    int points = matrix[day][nextAct] + recur(day + 1, nextAct, matrix, m, n);
                    maxPoints = Math.max(maxPoints, points);
                }
            }
            return maxPoints;
        }
    }

    static class Memoization {
        public int solve1(int[][] matrix) {
            int m = matrix.length;
            int n = 3; // running, stealth training, or fighting practice
            int[][] memo = new int[m][n + 1]; // n days, 4 possible last activities (0, 1, 2, and 3 for the initial state)
            for(int i = 0; i < m; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(0, 3, matrix, m, n, memo);
        }
        private int memoized(int day, int act, int[][] matrix, int m, int n, int[][] memo) {
            if(day >= m) {
                return 0;
            }

            if(memo[day][act] != -1) {
                return memo[day][act];
            }

            int maxPoints = 0;
            for(int nextAct = 0; nextAct < n; nextAct++) {
                if(nextAct != act) {
                    int points = matrix[day][nextAct] + memoized(day + 1, nextAct, matrix, m, n, memo);
                    maxPoints = Math.max(maxPoints, points);
                }
            }

            memo[day][act] = maxPoints;

            return memo[day][act];
        }
    }

    static class Tabulation {
        public int solve1(int[][] matrix) {
            int m = matrix.length;
            int n = 3; // running, stealth training, or fighting practice
            int[][] dp = new int[m][n];

            // --- Step 1: Base Case (Day 0) --- Imagine the input has only 1 row.
            dp[0][0] = matrix[0][0];
            dp[0][1] = matrix[0][1];
            dp[0][2] = matrix[0][2];

            // --- Step 2: Iteration (from Day 1 to m-1) ---
            // We only need one loop for the days.
            for (int day = 1; day < m; day++) {

                // For each activity on the current day, calculate its max score
                // by looking at the valid activities from the previous day.

                // Max points for ending with activity 0 on 'day'
                // Must have come from activity 1 or 2 on 'day - 1'
                dp[day][0] = matrix[day][0] + Math.max(dp[day - 1][1], dp[day - 1][2]);

                // Max points for ending with activity 1 on 'day'
                // Must have come from activity 0 or 2 on 'day - 1'
                dp[day][1] = matrix[day][1] + Math.max(dp[day - 1][0], dp[day - 1][2]);

                // Max points for ending with activity 2 on 'day'
                // Must have come from activity 0 or 1 on 'day - 1'
                dp[day][2] = matrix[day][2] + Math.max(dp[day - 1][0], dp[day - 1][1]);
            }

            return Math.max(dp[m - 1][0], Math.max(dp[m - 1][1], dp[m - 1][2]));
        }
    }
}

/*
Solved by self intuition
private int recur(int day, int act, int[][] matrix, int m, int n) {
    if(day >= m) {
        return 0;
    }
    int maxPoints = 0;
    if(act == 0) {
        int act1 = recur(day + 1, 1, matrix, m, n) + matrix[day][act];
        int act2 = recur(day + 1, 2, matrix, m, n) + matrix[day][act];
        return Math.max(act1, act2);
    } else if(act == 1) {
        int act0 = recur(day + 1, 0, matrix, m, n) + matrix[day][act];
        int act2 = recur(day + 1, 2, matrix, m, n) + matrix[day][act];
        return Math.max(act0, act2);
    } else {
        int act0 = recur(day + 1, 0, matrix, m, n) + matrix[day][act];
        int act1 = recur(day + 1, 1, matrix, m, n) + matrix[day][act];
        return Math.max(act0, act1);
    }


    if(day >= m) {
        return 0;
    }

    int maxPoints = 0;
    int actA;
    int actB;

    if(act == 0) {
        actA = recur(day + 1, 1, matrix, m, n);
        actB = recur(day + 1, 2, matrix, m, n);
    } else if(act == 1) {
        actA = recur(day + 1, 0, matrix, m, n);
        actB = recur(day + 1, 2, matrix, m, n);
    } else {
        actA = recur(day + 1, 0, matrix, m, n);
        actB = recur(day + 1, 1, matrix, m, n);
    }

    maxPoints = Math.max(maxPoints, Math.max(actA, actB));

    return maxPoints + matrix[day][act];
}
 */
