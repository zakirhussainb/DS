package com.zakcorp.striver_series.dp.lis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP_Lis_1 {
    static class Recursion {
        public int solve1(int[] arr) {
            return recur(0, -1, arr);
        }
        private static int recur(int ind, int prevInd, int[] arr) {
            if(ind == arr.length) {
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
                Arrays.fill(memo[i], -1);

            return memoized(0, -1, arr, memo);
        }
        private static int memoized(int ind, int prevInd, int[] arr, int[][] memo) {
            if(ind == arr.length) {
                return 0;
            }

            if(memo[ind][prevInd + 1] != -1) {
                return memo[ind][prevInd + 1];
            }

            int notPick = memoized(ind + 1, prevInd, arr, memo);

            int pick = 0;
            if(prevInd == -1 || arr[prevInd] < arr[ind]) {
                pick = memoized(ind + 1, ind, arr, memo) + 1;
            }

            memo[ind][prevInd + 1] = Math.max(notPick, pick);

            return memo[ind][prevInd + 1];
        }
    }

    static class LIS_BinarySearch {
        public int solve1(int[] arr) {
            int n = arr.length;
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[0]);
            for(int i = 1; i < n; i++) {
                if(arr[i] > temp.get(temp.size() - 1)) {
                    temp.add(arr[i]);
                } else {
                    int ind = lowerBoundBS(temp, arr[i]);
                    if (ind <= n)
                        temp.set(ind, arr[i]);
                }
            }
            return temp.size();
        }
        private static int lowerBoundBS(List<Integer> arr, int x) {
            int n = arr.size();
            int l = 0, h = n - 1;
            int ans = n;
            while(l <= h) {
                int m = l + (h - l) / 2;
                if(arr.get(m) >= x) {
                    ans = m;
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            return ans;
        }
    }
}
