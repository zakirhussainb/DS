package com.zakcorp.leetcodemaster;

public class Problem_1829
{
    static class Solver {
        /*
        I did this by myself, notes are there in OneNote LeetCode section.
         */
        public int[] solve1(int[] arr, int maximumBit) {
            int n = arr.length;
            int[] ans = new int[n];
            int maxVal = (int)Math.pow( 2, maximumBit ) - 1;
            // To avoid calculating the xor of elements every time, I store the prevVal -> which is basically xor of two no.s
            int prevVal = 0;
            for(int i = n - 1; i >= 0; i--) {
                ans[i] = prevVal ^ arr[n - i - 1] ^ maxVal;
                prevVal ^= arr[n - i - 1];
            }
            return ans;
        }
    }
}
