package com.zakcorp.leetcodemaster;

public class Problem_852 {
    static class Solver {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int i;
            for(i = 0; i < n - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    return i;
                }
            }
            return i;
        }
    }
}
