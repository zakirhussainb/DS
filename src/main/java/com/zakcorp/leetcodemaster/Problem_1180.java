package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1180 {
    static class Solver {
        // This solution is TLE for larger inputs
        public int solve1(String str) {
            int n = str.length();
            int res = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    String substr = str.substring(i, j + 1);
                    Set<Character> set = new HashSet<>();
                    for(char ch : substr.toCharArray()) {
                        set.add(ch);
                    }
                    if(set.size() == 1) {
                        res++;
                    }
                }
            }
            return res;
        }
        // Dynamic Programming Solution - O(n) and O(n)
        // Tabulation DP
        public int solve2(String str) {
            int n = str.length();
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for(int i = 1; i < n; i++) {
                if(str.charAt(i - 1) == str.charAt(i)) {
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = 1;
                }
            }
            int res = 0;
            for(int num : dp) {
                res += num;
            }
            return res;
        }

        // Dynamic Programming Solution - O(n) and O(1)
        public int solve3(String str) {
            int n = str.length();
            int count = 1;
            int res = count;
            for(int i = 1; i < n; i++) {
                if(str.charAt(i - 1) == str.charAt(i)) {
                    count += 1;
                } else {
                    count = 1;
                }
                res += count;
            }
            return res;
        }

        // Two Pointer Solution - O(n) and O(1)
        public int solve4(String str) {
            int n = str.length();
            int count = 0;
            int l = 0, r = 0;
            while(r < n) {
                if(str.charAt(l) == str.charAt(r)) {
                    count += (r - l + 1);
                    r++;
                } else {
                    l = r;
                }
            }
            return count;
        }
    }
}
