package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(String s, String target) {
            int[] sHash = new int[26];
            for(int i = 0; i < s.length(); i++) {
                sHash[s.charAt(i) - 'a']++;
            }
            int[] tHash = new int[26];
            for(int i = 0; i < target.length(); i++) {
                tHash[target.charAt(i) - 'a']++;
            }

            int min = Integer.MAX_VALUE;
            for(char ch : target.toCharArray())
                min = Math.min(min, sHash[ch - 'a'] / tHash[ch - 'a'] );

            return min;
        }
    }
}
