package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_978 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int maxLen = 1;
            int start = 0, end;
            for(end = 0; end + 1 < n; end++) {
                if (end % 2 == 0) {
                    if (arr[end] < arr[end + 1]) {
                        maxLen = Math.max(maxLen, (end + 1) - start + 1);
                    } else {
                        start = end + 1;
                    }
                } else {
                    if (arr[end] > arr[end + 1]) {
                        maxLen = Math.max(maxLen, (end + 1) - start + 1);
                    } else {
                        start = end + 1;
                    }
                }
            }
            start = 0;
            for(end = 0; end + 1 < n; end++) {
                if (end % 2 == 0) {
                    if (arr[end] > arr[end + 1]) {
                        maxLen = Math.max(maxLen, (end + 1) - start + 1);
                    } else {
                        start = end + 1;
                    }
                } else {
                    if (arr[end] < arr[end + 1]) {
                        maxLen = Math.max(maxLen, (end + 1) - start + 1);
                    } else {
                        start = end + 1;
                    }
                }
            }
            return maxLen;
        }
        public int solve2(int[] arr) {
            // TODO: Not working, come back after learning DP
            int n = arr.length;
            int[][] dp = new int[n][n];
            int ans = 1;
            for(int i = 0; i + 1 < n; i++) {
                if(arr[i + 1] > arr[i]) {
                    dp[i][0] = dp[i + 1][1] + 1;
                } else if(arr[i + 1] < arr[i]) {
                    dp[i][1] = dp[i + 1][0] + 1;
                }
                ans = Math.max(ans, Math.max(dp[i][0], dp[i][1]));
            }
            return ans;
        }
    }
}
