package com.zakcorp.leetcodemaster;

public class Problem_53 {
    static class Solver {
        public int findMaxSubArrayUsingKadane(int[] arr) {
            if(arr.length == 0)
                return 0;
            int finalMax = arr[0];
            int currentMax = arr[0];
            for(int i = 1; i < arr.length; i++) {
                currentMax = (currentMax < 0) ? arr[i] : (currentMax + arr[i]);
                finalMax = Math.max(finalMax, currentMax);
            }
            return finalMax;
        }
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return arr[0];
            int sum = 0, maxSum = Integer.MIN_VALUE;
            for (int num : arr) {
                sum += num;
                maxSum = Math.max(maxSum, sum);
                if (sum < 0)
                    sum = 0;
            }
            return maxSum;
        }
    }
}
