package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem_441 {
    static class Solver {
        public int arrangeCoins(int n) {

            return -1;
        }
    }
    static class Solver1 {
        public int arrangeCoins(int n) {
            long left = 0;
            long right = n;
            long res, mid;
            while(left <= right) {
                mid = left + (right - left) / 2;
                res = mid * (mid + 1) / 2;
                if(res == n) {
                    return (int)mid;
                } else if(res > n) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return (int)right;
        }
    }
}
