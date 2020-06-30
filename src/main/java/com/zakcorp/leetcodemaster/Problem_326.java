package com.zakcorp.leetcodemaster;

public class Problem_326 {
    static class Solver {
        public boolean isPowerOfThree(int num) {
            if(num < 1) {
                return false;
            }
            while(num % 3 == 0) {
                num /= 3;
            }
            return num == 1;
        }
    }
}
