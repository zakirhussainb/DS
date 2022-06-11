package com.zakcorp.leetcodemaster;

public class Problem_7 {
    static class Solver {
        // Basic Brute Force -> Should not be used -> because this is using long;
        public int solve1(int x) {
            long ans = 0;
            while(x != 0) {
                ans = (ans * 10) + (x % 10);
                x = x / 10;
            }
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
                return 0;
            return (int)ans;
        }
        public int solve2(int x) {
            int ans = 0;
            while(x != 0) {
                int tail = x % 10;
                int newAns = (ans * 10) + tail;
                if( (newAns - tail) / 10 != ans) { // TO AVOID INTEGER OVERFLOW/UNDERFLOW
                    return 0;
                }
                ans = newAns;
                x /= 10;
            }
            return ans;
        }
    }
}
