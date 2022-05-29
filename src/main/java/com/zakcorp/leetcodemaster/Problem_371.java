package com.zakcorp.leetcodemaster;

public class Problem_371 {
    static class Solver {
        public int solve1(int a, int b) {
            while(b != 0) {
                int sum = a ^ b;
                int carry = (a & b) << 1;
                a = sum;
                b = carry;
            }
            return a;
        }
    }
}
