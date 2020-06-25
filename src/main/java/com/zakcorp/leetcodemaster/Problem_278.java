package com.zakcorp.leetcodemaster;

public class Problem_278 {
    static class Solver {
        public int firstBadVersion(int n) {
            if(n < 1) {
                return 1;
            }
            int low = 1; int high = n;
            while(low < high) {
                int mid = low + (high - low) / 2;
                if(isBadVersion(mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
        private boolean isBadVersion(int n) {
            return false;
        }
    }
}
