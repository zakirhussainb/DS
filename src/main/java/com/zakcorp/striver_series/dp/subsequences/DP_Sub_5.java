package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_5 {

    private static final int MOD = 1000_000_007;
    static class Recursion {
        public int solve1(int[] arr, int diff) {
            int totalSum = 0;
            for(int num : arr) {
                totalSum += num;
            }
            // If (totalSum - diff) is negative or odd, no solution exists.
            // We check (totalSum - diff) instead of (totalSum + diff) to avoid potential overflow if totalSum and diff are large.
            // or if (totalSum - diff) value is odd, you cannot count the subsets for that..
            if ((totalSum - diff) < 0 || (totalSum - diff) % 2 != 0) {
                return 0;
            }

            int subset1 = (totalSum - diff) / 2;

            return recur(arr.length - 1,arr, subset1);
        }
        private int recur(int ind, int[] arr, int subset1) {
            if(ind < 0) {
                if(subset1 == 0) {
                    return 1;
                }
                return 0;
            }

            int notPick = recur(ind - 1, arr, subset1);
            int pick = 0;
            if(arr[ind] <= subset1) {
                pick = recur(ind - 1, arr, subset1 - arr[ind]);
            }

            return (pick + notPick) % MOD;
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int diff) {
            int totalSum = 0;
            for(int num : arr) {
                totalSum += num;
            }
            // If (totalSum - diff) is negative or odd, no solution exists.
            // We check (totalSum - diff) instead of (totalSum + diff) to avoid potential overflow if totalSum and diff are large.
            // or if (totalSum - diff) value is odd, you cannot count the subsets for that..
            if ((totalSum - diff) < 0 || (totalSum - diff) % 2 != 0) {
                return 0;
            }

            int subset1 = (totalSum - diff) / 2;
            int n = arr.length;
            int[][] memo = new int[n][subset1 + 1];
            for(int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(n - 1, arr, subset1, memo);
        }
        private int memoized(int ind, int[] arr, int subset1, int[][] memo) {
            if(ind < 0) {
                if(subset1 == 0) {
                    return 1;
                }
                return 0;
            }

            if(memo[ind][subset1] != -1) {
                return memo[ind][subset1];
            }

            int notPick = memoized(ind - 1, arr, subset1, memo);
            int pick = 0;
            if(arr[ind] <= subset1) {
                pick = memoized(ind - 1, arr, subset1 - arr[ind], memo);
            }

            memo[ind][subset1] = (pick + notPick) % MOD;

            return memo[ind][subset1];
        }
    }

    static class Tabulation {
        public int solve1(int[] arr, int diff) {
            int totalSum = 0;
            for(int num : arr) {
                totalSum += num;
            }
            // If (totalSum - diff) is negative or odd, no solution exists.
            // We check (totalSum - diff) instead of (totalSum + diff) to avoid potential overflow if totalSum and diff are large.
            // or if (totalSum - diff) value is odd, you cannot count the subsets for that..
            if ((totalSum - diff) < 0 || (totalSum - diff) % 2 != 0) {
                return 0;
            }

            int subset1 = (totalSum - diff) / 2;
            int n = arr.length;
            int[][] dp = new int[n + 1][subset1 + 1];

            dp[0][0] = 1;

            for(int i = 1; i <= n; i++) {
                for(int s1 = 0; s1 <= subset1; s1++) {
                    int notPick = dp[i - 1][s1];
                    int pick = 0;
                    if(arr[i - 1] <= s1) {
                        pick = dp[i - 1][s1 - arr[i - 1]];
                    }

                    dp[i][s1] = (pick + notPick) % MOD;
                }
            }

            return dp[n][subset1];
        }
    }
}
