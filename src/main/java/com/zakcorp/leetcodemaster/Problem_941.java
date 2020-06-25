package com.zakcorp.leetcodemaster;

public class Problem_941 {
    static class Solver {
        public boolean validMountainArray(int[] arr) {
            if(arr.length < 3) {
                return false;
            }
            boolean isMountain = true;
            int n = arr.length;
            int i = 0;
            while(i < n - 1) {
                if(arr[i] < arr[i + 1]) {
                    i++;
                } else {
                    isMountain = false;
                    break;
                }
            }
            while(i < n - 1) {
                if(arr[i] > arr[i + 1]) {
                    isMountain = true;
                    i++;
                } else {
                    isMountain = false;
                    break;
                }
            }
            return isMountain;
        }
    }
}
