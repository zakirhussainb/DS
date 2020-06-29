package com.zakcorp.leetcodemaster;

public class Problem_374 {
    static class Solver {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(guess(mid) == 0) {
                    return mid;
                } else if(guess(mid) == 1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
        private int guess(int num) {
            return Integer.compare(num, 6);
        }
    }
}
