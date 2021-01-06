package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_70 {
    static class Solver {
        // Brute Force - Recursive solution gives TLE when 'n' is 45
        public int solve1(int n) {
            if(n < 0) {
                return 0;
            }
            if(n == 0) {
                return 1;
            }
            return solve1(n - 1) + solve1(n - 2);
        }
    }
    static class Solver1 {
        // Brute Force - Recursive solution gives TLE when 'n' is 45
        public int solve1(int n) {
            int[] memo = new int[n + 1];
            return memoized(n, memo);
        }
        private int memoized(int n, int[] memo) {
            if(n < 0) {
                return 0;
            }
            if(memo[n] != 0) {
                return memo[n];
            }
            if(n == 0) {
                return 1;
            }
            memo[n] = memoized(n - 1, memo) + memoized(n - 2, memo);
            return memo[n];
        }
    }
}
