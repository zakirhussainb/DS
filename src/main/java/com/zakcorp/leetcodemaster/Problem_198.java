package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_198 {
    // Simpl Brute Force - TLE
    static class Solver {
        public int solve1(int[] arr) {
            return recursive(arr.length - 1, arr);
        }
        private int recursive(int n, int[] arr) {
            if(n < 0)
                return 0;
            return Math.max( recursive(n - 2, arr) + arr[n], recursive(n - 1, arr) );
        }
    }
}
