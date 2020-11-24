package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1456 {
    static class Solver {
        public int solve1(String str, int k) {
            int n = str.length();
            int start = 0, end = 0;
            int windowSum = 0, maxSum = 0;
            while(end < n) {
                if(isVowel(str.charAt(end))) {
                    windowSum++;
                }
                if(end - start + 1 > k) {
                    if(isVowel(str.charAt(start))) {
                        windowSum--;
                    }
                    start++;
                }
                maxSum = Math.max(maxSum, windowSum);
                end++;
            }
            return maxSum;
        }
        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
}
