package com.zakcorp.leetcodemaster;

public class Problem_342 {
    static class Solver {
        public boolean isPowerOfFour(int num) {
            if(num < 1) {
                return false;
            }
            while(num % 4 == 0) {
                num /= 4;
            }
            return num == 1;
        }
    }
}
