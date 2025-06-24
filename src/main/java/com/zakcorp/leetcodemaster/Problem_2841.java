package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2841 {
    static class Solver {
        public long solve1(List<Integer> list, int m, int k) {
            long sum = 0, maxSum = 0;
            int n = list.size();
            int start = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int end = 0; end < n; end++) {
                int leftNum = list.get(end);
                map.put(leftNum, map.getOrDefault(leftNum, 0) + 1);
                sum += leftNum;

                // Shrink the window if it exceeds k elements
                while(end - start + 1 > k) {
                    int rightNum = list.get(start);
                    map.put(rightNum, map.get(rightNum) - 1);
                    map.remove(rightNum, 0);
                    sum -= rightNum;
                    // shrink the window size, by incrementing the start pointer
                    start++;
                }
                // Check if sub array has m distinct elements and then update maxSum
                if(map.size() >= m) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
            return maxSum;
        }
    }
}
