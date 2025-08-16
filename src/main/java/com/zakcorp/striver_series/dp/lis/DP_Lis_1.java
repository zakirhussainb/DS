package com.zakcorp.striver_series.dp.lis;

import java.util.Arrays;

public class DP_Lis_1 {
    static class Recursion {
        public int solve1(int[] arr) {
            return recur(0, -1, arr);
        }
        private static int recur(int ind, int prevInd, int[] arr) {
            if(ind == arr.length - 1) {
                if(prevInd == -1 || arr[prevInd] < arr[ind]) {
                    return 1;
                }
                return 0;
            }

            int notPick = recur(ind + 1, prevInd, arr);

            int pick = Integer.MIN_VALUE;
            if(prevInd == -1 || arr[prevInd] < arr[ind]) {
                pick = recur(ind + 1, ind, arr) + 1;
            }

            return Math.max(notPick, pick);
        }
    }

    static class Memoization {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[][] memo = new int[n][n + 1];
            for(int i = 0; i < n; i++)
                Arrays.fill(memo[i], Integer.MIN_VALUE);

            return memoized(0, -1, arr, memo);
        }
        private static int memoized(int ind, int prevInd, int[] arr, int[][] memo) {
            if(ind == arr.length - 1) {
                if(prevInd == -1 || arr[prevInd] < arr[ind]) {
                    return 1;
                }
                return 0;
            }

            if(prevInd != -1 && memo[ind][prevInd] != Integer.MIN_VALUE) {
                return memo[ind][prevInd];
            }

            int notPick = memoized(ind + 1, prevInd, arr, memo);

            int pick = Integer.MIN_VALUE;
            if(prevInd == -1 || arr[prevInd] < arr[ind]) {
                pick = memoized(ind + 1, ind, arr, memo) + 1;
            }

            if (prevInd != -1)
                memo[ind][prevInd] = Math.max(notPick, pick);

            return Math.max(notPick, pick);
        }
    }
}
