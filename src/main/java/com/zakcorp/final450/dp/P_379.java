package com.zakcorp.final450.dp;

public class P_379 {
    static class Solver {
        public long recursive(int[] arr, int target) {
            long[] counter = new long[]{0};
            solve(arr, target, counter);
            return counter[0];
        }
        public long solve(int[] arr, int target, long[] counter) {
            if(target == 0)
                return 1;
            for(int num : arr) {
                int diff = target - num;
                if(diff >= 0) {
                    counter[0] += recursive(arr, diff);
                }
            }
            return counter[0];
        }
    }
    static class Solver2 {
        public long tabulation(int[] arr, int target) {
            long[] dp = new long[target + 1];
            dp[0] = 1;
            for(int i = 0; i < dp.length; i++) {
                if(dp[i] != 0) {
                    for(int num : arr) {
                        if(i + num <= target) {
                            dp[i + num] += dp[i];
                        }
                    }
                }
            }
            return dp[target];
        }

    }
}
