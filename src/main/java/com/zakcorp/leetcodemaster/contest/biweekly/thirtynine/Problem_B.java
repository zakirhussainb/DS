package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

public class Problem_B {
    static class Solver {
        public int solve1(String str) {
            // aababbab
            int a = 0, b = 0, l = 0, r = str.length() - 1, res = 0;
            for (char ch : str.toCharArray()) {
                a += (ch == 'a' ? 1 : 0);
                b += (ch == 'b' ? 1 : 0);
            }
            while (l < r) {
                if (a > 0 && str.charAt(l) == 'a') {
                    ++l;
                    --a;
                } else if (b > 0 && str.charAt(r) == 'b') {
                    --r;
                    --b;
                } else {
                    ++res;
                    if (a < b) {
                        --a;
                        --r;
                    }
                    else {
                        --b;
                        ++l;
                    }
                }
            }
            return res;
        }
    }
}
