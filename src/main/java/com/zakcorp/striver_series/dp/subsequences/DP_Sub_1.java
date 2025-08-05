package com.zakcorp.striver_series.dp.subsequences;

public class DP_Sub_1 {
    static class Recursion {
        public boolean solve1(int[] arr, int target) {
            return recur(0, target, arr);
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
}
