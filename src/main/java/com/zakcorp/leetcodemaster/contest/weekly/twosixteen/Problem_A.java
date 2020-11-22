package com.zakcorp.leetcodemaster.contest.weekly.twosixteen;

public class Problem_A {
    static class Solver {
        public boolean solve1(String[] word1, String[] word2) {
            StringBuilder sb = new StringBuilder();
            for(String str : word1) {
                sb.append(str);
            }
            StringBuilder sb1 = new StringBuilder();
            for(String str : word2) {
                sb1.append(str);
            }
            return sb.toString().equals(sb1.toString());
        }
    }
}
