package com.zakcorp.striver_series.dp.stocks;

import java.util.Arrays;

public class DP_Stocks_4 {
    static class Recursion {
        public int solve1(int[] arr, int n, int k) {
            return recur(0, 0, k, arr, n);
        }
        private int recur(int day, int buy, int capacity, int[] arr, int n) {
            if(day == n || capacity == 0) {
                return 0;
            }
            int op1;
            int op2;
            if(buy == 0) {
                op1 = (-1) * arr[day] + recur(day + 1, 1, capacity, arr, n);
                op2 = recur(day + 1, 0, capacity, arr, n);
            } else {
                op1 = arr[day] + recur(day + 1, 0, capacity - 1, arr, n);
                op2 = recur(day + 1, 1, capacity, arr, n);
            }
            return Math.max(op1, op2);
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int n, int k) {
            int[][][] memo = new int[n][2][k + 1];
            for(int x = 0; x < n; x++) {
                for(int y = 0; y < 2; y++) {
                    Arrays.fill(memo[x][y], -1);
                }
            }
            return memoized(0, 0, k, arr, n, memo);
        }
        private int memoized(int day, int buy, int capacity, int[] arr, int n, int[][][] memo) {
            if(day == n || capacity == 0) {
                return 0;
            }

            if(memo[day][buy][capacity] != -1) {
                return memo[day][buy][capacity];
            }

            int op1;
            int op2;
            if(buy == 0) {
                op1 = (-1) * arr[day] + memoized(day + 1, 1, capacity, arr, n, memo);
                op2 = memoized(day + 1, 0, capacity, arr, n, memo);
            } else {
                op1 = arr[day] + memoized(day + 1, 0, capacity - 1, arr, n, memo);
                op2 = memoized(day + 1, 1, capacity, arr, n, memo);
            }
            memo[day][buy][capacity] = Math.max(op1, op2);

            return memo[day][buy][capacity];
        }
    }

    static class Tabulation {
        public int solve1(int[] arr, int n, int k) {
            int[][][] dp = new int[n + 1][2][k + 1];
            for(int day = n - 1; day >= 0; day--) {
                for(int buy = 0; buy < 2; buy++) {
                    for(int capacity = 1; capacity < k + 1; capacity++) {
                        int op1;
                        int op2;
                        if(buy == 0) {
                            op1 = (-1) * arr[day] + dp[day + 1][1][capacity];
                            op2 = dp[day + 1][0][capacity];
                        } else {
                            op1 = arr[day] + dp[day + 1][0][capacity - 1];
                            op2 = dp[day + 1][1][capacity];
                        }
                        dp[day][buy][capacity] = Math.max(op1, op2);
                    }
                }
            }
            return dp[0][0][k];
        }
    }
}
