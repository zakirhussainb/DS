package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1343 {
    static class Solver {
        public int solve1(int[] arr, int k, int threshold) {
            int start = 0, n = arr.length;
            int sum = 0, count = 0;
            for(int end = 0; end < n; end++) {
                sum += arr[end];
                if(end - start + 1 >= k) {
                    if(sum / k >= threshold) {
                        count++;
                    }
                    sum = sum - arr[start];
                    start++;
                }
            }
            return count;
        }

    }
}
