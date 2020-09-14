package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 14/09/20.
 *
 * @source: LeetCode
 * @topic: Sliding Window
 * @sub-topic: Sliding Window, Two Pointers, Strings
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/consecutive-characters/
 * @pseudocode: Use Two Pointers -> Solution 2 is updated recently
 */
public class Problem_1446 {
    static class Solver {
        // 1ms
        public int solve1(String str) {
            int n = str.length();
            int i = 0; int j = 1;
            int count = 1, maxPow = 1;
            while(i < n && j < n) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                    maxPow = Math.max(maxPow, count);
                } else {
                    i = j;
                    count = 1;
                }
                j++;
            }
            return maxPow;
        }
        public int solve2(String str) {
            int n = str.length();
            int i = 0, maxPower = 1;
            for(int j = 1; j < n; j++) {
                if(str.charAt(i) != str.charAt(j)){
                    i = j;
                } else {
                    maxPower = Math.max(maxPower, j - i + 1);
                }
            }
            return maxPower;
        }
    }
}
