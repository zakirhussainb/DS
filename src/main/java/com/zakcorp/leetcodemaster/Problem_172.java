package com.zakcorp.leetcodemaster;

import java.math.BigInteger;

public class Problem_172 {
    static class Solver {
        public int trailingZeroes(int n) {
            // O(log N) approach.
            int count = 0, temp;
            while(n != 0) {
                temp = n / 5;
                count += temp;
                n = temp;
            }
            return count;
        }
    }
}
