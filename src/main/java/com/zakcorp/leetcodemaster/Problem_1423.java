package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1423 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            int n = arr.length;
            int leftSum = 0, rightSum = 0;
            int left = 0, right = n - 1, maxScore = 0;
            for(int i = 0; i < k; i++) {
                leftSum += arr[i];
                left++;
            }
            maxScore = leftSum;
            for(int i = 0; i < k; i++) {
                rightSum += arr[right--];
                leftSum -= arr[--left];
                maxScore = Math.max(maxScore, leftSum + rightSum);
            }
            return maxScore;
        }
    }
}
