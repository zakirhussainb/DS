package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

import java.util.*;

public class Problem_C {
    static class Solver {
        public int solve1(int[] forbidden, int a, int b, int x) {
            if(a > x && b > x) {
                return -1;
            }
            if(x % a == 0) {
                return a;
            }
            int i = 0, steps = 0;
            while(i < x) {
                i = a + i;
                if( i > x ) {
                    i = i - b;
                }
            }
            return 0;
        }
    }
}
