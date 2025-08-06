package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_2 {
    static class Recursion {
        public boolean solve1(int[] arr) {
            int target = 0;
            for(int num : arr) {
                target += num;
            }
            return recur(0, target / 2, arr);
        }
        private boolean recur(int ind, int target, int[] arr) {
            if(target == 0) {
                return true;
            }
            if(ind >= arr.length || target < 0) {
                return false;
            }
            boolean pick = recur(ind + 1, target - arr[ind], arr);
            boolean notPick = recur(ind + 1, target, arr);

            return pick || notPick;
        }
    }

    static class Memoization {
        public boolean solve1(int[] arr) {
            int target = 0;
            for(int num : arr) {
                target += num;
            }
            int[][] memo = new int[arr.length][(target / 2) + 1];
            for(int i = 0; i < arr.length; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(0, target / 2, arr, memo);
        }
        private boolean memoized(int ind, int target, int[] arr, int[][] memo) {
            if(target == 0) {
                return true;
            }
            if(ind >= arr.length || target < 0) {
                return false;
            }
            if(memo[ind][target] != -1) {
                return memo[ind][target] == 1;
            }
            boolean pick = memoized(ind + 1, target - arr[ind], arr, memo);
            boolean notPick = memoized(ind + 1, target, arr, memo);

            memo[ind][target] = (pick || notPick) ? 1 : 0;

            return pick || notPick;
        }
    }
}
