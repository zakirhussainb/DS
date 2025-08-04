package com.zakcorp.striver_series.dp.stocks;

import java.util.Arrays;

public class DP_Stocks_2 {
    static class Recursion {
        public int solve1(int[] arr, int n) {
            return recur(0, 0, arr, n);
        }
        private int recur(int day, int buy, int[] arr, int n) {
            if(day == n) {
                return 0;
            }
            int op1;
            int op2;
            if(buy == 0) {
                op1 = (-1) * arr[day] + recur(day + 1, 1, arr, n);
                op2 = recur(day + 1, 0, arr, n);
            } else {
                op1 = arr[day] + recur(day + 1, 0, arr, n);
                op2 = recur(day + 1, 1, arr, n);
            }
            return Math.max(op1, op2);
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int n) {
            int[][] memo = new int[n][2];
            for(int r = 0; r < n; r++) {
                Arrays.fill(memo[r], -1);
            }
            return memoized(0, 0, arr, n, memo);
        }
        private int memoized(int day, int buy, int[] arr, int n, int[][] memo) {
            if(day == n) {
                return 0;
            }
            if(memo[day][buy] != -1) {
                return memo[day][buy];
            }
            int op1;
            int op2;
            if(buy == 0) {
                op1 = (-1) * arr[day] + memoized(day + 1, 1, arr, n, memo);
                op2 = memoized(day + 1, 0, arr, n, memo);
            } else {
                op1 = arr[day] + memoized(day + 1, 0, arr, n, memo);
                op2 = memoized(day + 1, 1, arr, n, memo);
            }
            memo[day][buy] = Math.max(op1, op2);
            return memo[day][buy];
        }
    }
}
