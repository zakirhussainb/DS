package com.zakcorp.leetcodemaster;


public class Problem_633 {
    static class Solver {
        public boolean solve1(int c) {
            // This solution only solves for O(n^2)
            if(c == 0)
                return true;
            for(long a = 0; a * a <= c; a++) {
                for(long b = 0; b * b <= c; b++) {
                    long output = (a * a) + (b * b);
                    if( c == output ) {
                        return true;
                    } else if(output > c) {
                        break;
                    }
                }
            }
            return false;
        }
        public boolean solve2(int c) {
            // We need to prove that c - a^2 = b^2, In this we loop only once, thus reducing the complexity to O(n).
            for(long a = 0; a * a <= c; a++) {
                double b = Math.sqrt(c - (a * a));
                if(b == (long)b) {
                    return true;
                }
            }
            return false;
        }
        public boolean solve3(int c) {
            // We need to prove that c - a^2 = b^2, In this we loop only once, but this time we are
            // going to search using Binary Search, thus reducing the complexity to O(log n).
            int a = 0;
            int b =(int)Math.sqrt(c);
            while(a <= b) {
                int squareSum = a * a + b * b;
                if(squareSum < c) {
                    a++;
                } else if(squareSum > c) {
                    b--;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
