package com.zakcorp.leetcodemaster;

public class Problem_69 {
    static class Solver {
        public int mySqrt(int x) {
            // Using Binary Search is more efficient when compared to solving it using Naive approach
            int left = 1; int right = x;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(mid == x / mid) {
                    return mid;
                } else if(mid > x / mid) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }
    }
    static class Solver1 {
        // Naive approach is very simple, but it gives Time Limit Exceeded, "2147483647"
        public int mySqrt(int x) {
            if(x <= 0){
                return 0;
            }
            int k = 1;
            for(int i = 1; i <= x; i++) {
                if(i * i == x) {
                    k = i;
                    break;
                } else if(i * i > x) {
                    k = i - 1;
                    break;
                }
            }
            return k;
        }
    }
}
