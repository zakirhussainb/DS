package com.zakcorp.striver_series.dp.stocks;

import java.util.Arrays;

public class DP_Stocks_5 {
    static class Recursion {
        public int solve1(int[] arr, int n, int fee) {
            return recur(0, 0, fee, arr, n);
        }
        private int recur(int day, int buy, int fee, int[] arr, int n) {
            if(day == n) {
                return 0;
            }
            int op1;
            int op2;
            if(buy == 0) {
                op1 = recur(day + 1, 0, fee, arr, n);
                op2 = (-1) * arr[day] + recur(day + 1, 1, fee, arr, n);
            } else {
                op1 = recur(day + 1, 1, fee, arr, n);
                op2 = arr[day] + recur(day + 1, 0, fee, arr, n);

                op2 -= fee;
            }
            return Math.max(op1, op2);
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int n, int fee) {
            int[][] memo = new int[n][2];
            for(int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(0, 0, fee, arr, n, memo);
        }
        private int memoized(int day, int buy, int fee, int[] arr, int n, int[][] memo) {
            if(day == n) {
                return 0;
            }
            if(memo[day][buy] != -1) {
                return memo[day][buy];
            }
            int op1;
            int op2;
            if(buy == 0) {
                op1 = memoized(day + 1, 0, fee, arr, n, memo);
                op2 = (-1) * arr[day] + memoized(day + 1, 1, fee, arr, n, memo);
            } else {
                op1 = memoized(day + 1, 1, fee, arr, n, memo);
                op2 = arr[day] + memoized(day + 1, 0, fee, arr, n, memo);

                op2 -= fee;
            }

            memo[day][buy] = Math.max(op1, op2);

            return memo[day][buy];
        }
    }

    static class Tabulation {
        public int solve1(int[] arr, int n, int fee) {
            int[][] dp = new int[n + 1][2];
            for(int day = n - 1; day >= 0; day--) {
                for(int buy = 0; buy < 2; buy++) {
                    int op1;
                    int op2;
                    if(buy == 0) {
                        op1 = dp[day + 1][0];
                        op2 = (-1) * arr[day] + dp[day + 1][1];
                    } else {
                        op1 = dp[day + 1][1];
                        op2 = arr[day] + dp[day + 1][0];

                        op2 -= fee;
                    }
                    dp[day][buy] = Math.max(op1, op2);
                }
            }

            return dp[0][0];
        }
    }
}
