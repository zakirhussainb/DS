package com.zakcorp.leetcodemaster;

public class Problem_461 {
    static class Solver {
        public int solve1(int x, int y) {
            String binaryX = Integer.toBinaryString(x);
            String binaryY = Integer.toBinaryString(y);
            int m = binaryX.length();
            int n = binaryY.length();
            while(m < n) {
                binaryX = "0" + binaryX;
                m++;
            }
            while(n < m) {
                binaryY = "0" + binaryY;
                n++;
            }
            return getHammingDist(binaryX, binaryY);
        }
        private int getHammingDist(String binaryX, String binaryY) {
            int distance = 0;
            for(int i = 0; i < binaryX.length(); i++) {
                if(binaryX.charAt(i) != binaryY.charAt(i)) {
                    distance++;
                }
            }
            return distance;
        }
        /* Intuition of the problem
        We know that XOR for two values results in a set bit when the bits are
        different.
        1. Find the xored value.
        2. Count the number of set bits present in the xored value.
        3. This count will give you the required hamming distance;
        */
        public int solve2(int x, int y) {
            int xored = x ^ y;
            int count = 0;
            while(xored != 0) {
                xored = xored & (xored - 1);
                count++;
            }
            return count;
        }
    }
}
