package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_279 {
    static class Solver {
        public int solve1(int n) {
            return recursive(n, n);
        }
        private int recursive(int n, int val) {
            if(n == 1)
                return val;
            if(isPerfectSquare(n)) {
                val = val - n;
                if(val == 0) {
                    return 1;
                } else {
                    return recursive(val, val) + val;
                }
            } else {
                return recursive(n - 1, val);
            }
        }
        private boolean isPerfectSquare(int num) {
            long left = 1;
            long right = num / 2;
            while(left <= right) {
                long mid = left + (right - left) / 2;
                if(mid * mid == num) {
                    return true;
                } else if(mid * mid > num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return false;
        }
    }
}
