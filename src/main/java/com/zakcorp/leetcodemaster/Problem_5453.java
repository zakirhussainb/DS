package com.zakcorp.leetcodemaster;

public class Problem_5453 {
    static class Solver {
        public int[] runningSum(int[] arr) {
            int n = arr.length;
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += arr[i];
                arr[i] = sum;
            }
            return arr;
        }
    }

}
