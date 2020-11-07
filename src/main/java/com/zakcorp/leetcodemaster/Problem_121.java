package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_121 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length, maxSum = 0;
            for(int i = 0; i < n - 1; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] < arr[j]) {
                        maxSum = Math.max(maxSum, arr[j] - arr[i]);
                    }
                }
            }
            return maxSum;
        }
        public int solve2(int[] arr) {
            int n = arr.length, currMax = 0, maxSoFar = 0;
            for(int i = 1; i < n; i++) {
                currMax = Math.max(0, currMax += arr[i] - arr[i - 1]);
                maxSoFar = Math.max(maxSoFar, currMax);
            }
            return maxSoFar;
        }
    }
}
