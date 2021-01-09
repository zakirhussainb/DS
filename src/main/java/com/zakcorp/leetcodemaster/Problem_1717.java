package com.zakcorp.leetcodemaster;

public class Problem_1717 {
    // Good Brute Force Solution, Got TLE, since the arr size is 10 ^ 5 - Recursive
    static class Solver {
        public int solve1(String str, int x, int y) {
            StringBuilder sb = new StringBuilder(str);
            if(x > y) {
                return recur(sb, "ab", "ba", 0, x, y);
            } else {
                return recur(sb, "ba", "ab", 0, y, x);
            }
        }
        private int recur(StringBuilder sb, String ch1, String ch2, int score, int x, int y) {
            int ch1Index = sb.indexOf(ch1);
            int ch2Index = sb.indexOf(ch2);
            if(ch1Index >= 0) {
                sb.delete(ch1Index, ch1Index + 2);
                return recur(sb, ch1, ch2, score + x, x, y);
            } else if(ch2Index >= 0) {
                sb.delete(ch2Index, ch2Index + 2);
                return recur(sb, ch1, ch2,score + y, x, y);
            }
            return score;
        }
    }
    // Good Brute Force Solution, Got TLE, since the arr size is 10 ^ 5 - Iterative
    static class Solver1 {
        public int solve1(String str, int x, int y) {
            StringBuilder sb = new StringBuilder(str);
            String ch1 = "ab";
            String ch2 = "ba";
            int score = 0;
            if(x > y) {
                score += process(sb, ch1, ch2, x, y);
            } else {
                score += process(sb, ch2, ch1, y, x);
            }
            return score;
        }
        private int process(StringBuilder sb, String ch1, String ch2, int x, int y) {
            int score = 0;
            for(int i = 0; i < sb.length(); i++) {
                int ch1Index = sb.indexOf(ch1);
                int ch2Index = sb.indexOf(ch2);
                if(ch1Index >= 0) {
                    sb.delete(ch1Index, ch1Index + 2);
                    score += x;
                } else if(ch2Index >= 0) {
                    sb.delete(ch2Index, ch2Index + 2);
                    score += y;
                }
            }
            return score;
        }
    }
}
