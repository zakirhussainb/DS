package com.zakcorp.leetcodemaster;

public class Problem_342 {
    static class Solver {
        public boolean solve1(int num) {
            if(num < 1) {
                return false;
            }
            while(num % 4 == 0) {
                num /= 4;
            }
            return num == 1;
        }
        public boolean solve2(int num) {
            return num > 0 && (num & (num - 1)) == 0 && (num & 0x555_555_55) != 0;
        }
    }
}
