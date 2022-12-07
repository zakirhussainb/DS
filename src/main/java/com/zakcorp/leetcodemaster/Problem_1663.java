package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_1663
{
    static class Solver {
        public String solve1(int n, int k) {
            char[] chArr = new char[n];
            Arrays.fill(chArr, 'a');
            k -= n;
            while(k > 0) {
                chArr[--n] += Math.min( k, 25 );
                k -= Math.min( k, 25 );
            }
            return new String(chArr);
        }
    }
}
