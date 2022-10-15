package com.zakcorp.leetcodemaster.contest;

public class Problem_A {
    static class Solver {
        public int solve1(String time) {
            int h1 = time.charAt(0);
            int h2 = time.charAt(1);
            int m1 = time.charAt(3);
            int m2 = time.charAt(4);
            int p = 1;
            if(h1 == 63) {
                if(h2 != 63) {
                    if(h2 < 52) {
                        p *= 3;
                    } else {
                        p *= 2;
                    }
                } else {
                    p *= 24;
                }
            }
            if(h1 != 63) {
                if(h1 == 50) {
                    if(h2 == 63) {
                        p *= 4;
                    }
                } else {
                    if(h2 == 63) {
                        p *= 10;
                    }
                }

            }
            if(m1 == 63) {
                if(m2 != 63) {
                    p *= 6;
                } else {
                    p *= 60;
                }
            }
            if(m1 != 63) {
                if(m2 == 63) {
                    p *= 10;
                }
            }
            return p;
        }
    }
}
