package com.zakcorp.striver_series.dp.lis;

import java.util.*;

public class DP_Lis_4 {
    static class Tabulation {
        public int solve1(String[] words) {
            int n = words.length;

            Arrays.sort(words, Comparator.comparingInt(String::length));

            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            int maxVal = 0;
            for(int currInd = 0; currInd < n; currInd++) {
                for(int prevInd = 0; prevInd < currInd; prevInd++) {
                    if(checkPossible(words[currInd], words[prevInd]) && dp[currInd] < 1 + dp[prevInd]) {
                        dp[currInd] = 1 + dp[prevInd];
                    }
                }
                if(dp[currInd] > maxVal) {
                    maxVal = dp[currInd];
                }
            }
            return maxVal;
        }

        private static boolean checkPossible(String s1, String s2) {
            if(s1.length() != s2.length() + 1)
                return false;
            int i = 0, j = 0;
            while(i < s1.length()) {
                if(j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }

            return i == s1.length() && j == s2.length();
        }
    }
}
