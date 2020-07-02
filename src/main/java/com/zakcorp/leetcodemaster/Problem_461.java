package com.zakcorp.leetcodemaster;

public class Problem_461 {
    static class Solver {
        public int hammingDistance(int x, int y) {
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
    }
}
