package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_91 {
    // Good Solution But TLE - Plain recursive
    static class Solver {
        public int solve1(String str) {
            return recursive(0, str);
        }
        private int recursive(int index, String str) {
            if(index == str.length()) {
                return 1;
            }
            if(str.charAt(index) == '0') {
                return 0;
            }
            if(index == str.length() - 1) {
                return 1;
            }
            int ans = recursive(index + 1, str);
            int alpha = Integer.parseInt(str.substring(index, index + 2));
            if(alpha <= 26) {
                ans += recursive(index + 2, str);
            }
            return ans;
        }
    }
    static class Solver1 {
        public int solve1(String str) {
            int[] memo = new int[str.length() + 1];
            return memoized(0, str, memo);
        }
        private int memoized(int index, String str, int[] memo) {
            if(memo[index] != 0)
                return memo[index];
            if(index == str.length())
                return 1;
            if(str.charAt(index) == '0')
                return 0;
            if(index == str.length() - 1)
                return 1;
            int ans = memoized(index + 1, str, memo);
            int alpha = Integer.parseInt(str.substring(index, index + 2));
            if(alpha <= 26) {
                ans += memoized(index + 2, str, memo);
            }
            memo[index] = ans;
            return memo[index];
        }
    }
}
