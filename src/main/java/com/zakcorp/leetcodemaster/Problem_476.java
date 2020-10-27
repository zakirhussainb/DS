package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_476 {
    static class Solver {
        public int solve1(int num) {
            int n = 0, j = 0;
            while(n < num) {
                n += (int)Math.pow(2, j);
                j++;
            }
            return n - num;
        }
        public int solve2(int num) {
            int n = 0;
            while(n < num) {
                n = (n << 1) | 1; // Similar to Math.pow(2, n);
            }
            return n - num;
        }
    }
}
