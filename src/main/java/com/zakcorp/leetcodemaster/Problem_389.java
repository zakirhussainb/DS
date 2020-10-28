package com.zakcorp.leetcodemaster;

public class Problem_389 {
    static class Solver {
        public char solve1(String s, String t) {
            int sSum = 0;
            for(int i = 0; i < s.length(); i++) {
                sSum += s.charAt(i) - 'a';
            }
            int tSum = 0;
            for(int i = 0; i < t.length(); i++) {
                tSum += t.charAt(i) - 'a';
            }
            int val = tSum - sSum;
            return (char)('a' + val);
        }
        public char solve2(String s, String t) {
            int sSum = 0;
            for(int i = 0; i < s.length(); i++) {
                sSum ^= s.charAt(i);
            }
            for(int i = 0; i < t.length(); i++) {
                sSum ^= t.charAt(i);
            }
            return (char)sSum;
        }
    }
}
