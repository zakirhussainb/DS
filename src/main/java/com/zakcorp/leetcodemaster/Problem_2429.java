package com.zakcorp.leetcodemaster;

public class Problem_2429
{
    static class Solver {
        public int solve1(int num1, int num2) {
            int minVal = Integer.MAX_VALUE;
            int res = 0;
            for(int i = 1; i <= Math.max(num1, num2) * 2; i++) {
                if ( Integer.bitCount( i ) == Integer.bitCount( num2 ) ) {
                    int val = i ^ num1;
                    if(val < minVal) {
                        minVal = val;
                        res = i;
                    }
                }
            }
            return res;
        }
    }
}
