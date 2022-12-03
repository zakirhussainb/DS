package com.zakcorp.leetcodemaster;

public class Problem_1318
{
    static class Solver {
        public int solve1(int a, int b, int c) {
            if( (a ^ b) == c)
                return 0;
            int equ = 0;
            int low = Math.min(a, b), high = Math.max(a, b);
            int res = 0;
            while(equ != c) {
                equ = low | high;
                if(equ < c) {
                    low++;
                } else if(equ > c) {
                    high--;
                }
                res++;
            }
            return res;
        }
    }
}
