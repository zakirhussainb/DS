package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1151 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int countOnes = 0;
            for (int num : arr) {
                countOnes += num;
            }
            int start = 0, end = 0;
            int windowOnes = 0, maxOnes = 0;
            for(; end < n; end++) {
                windowOnes += arr[end];
                if( end - start == countOnes - 1) {
                    maxOnes = Math.max(maxOnes, windowOnes);
                    windowOnes = windowOnes - arr[start];
                    start++;
                }
            }
            return countOnes - maxOnes;
        }
    }
}
