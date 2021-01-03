package com.zakcorp.leetcodemaster.contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Problem_B {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int ways = 0;
            int mod = 1000000007;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if(isPowerOfTwo(sum)) {
                        ways = (ways + 1) % mod;
                    }
                }
            }
            return ways;
        }
        private boolean isPowerOfTwo(int n) {
            if(n <= 0) {
                return false;
            }
            return (n & (n - 1)) == 0;
        }
    }
}
