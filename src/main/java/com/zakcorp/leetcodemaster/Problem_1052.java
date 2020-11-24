package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1052 {
    static class Solver {
        public int solve1(int[] customers, int[] grumpy, int X) {
            List<Integer> indices = new ArrayList<>();
            for(int i = 0; i < grumpy.length; i++) {
                if(grumpy[i] == 0)
                    indices.add(i);
            }
            int initialSum = 0;
            for(int index : indices) {
                initialSum += customers[index];
            }
            int start = 0, end = 0;
            int windowSum = 0, maxSum = 0;
            while(end < customers.length) {
                if(grumpy[end] == 1) {
                    windowSum += customers[end];
                }
                if(end - start + 1 > X) {
                    if(grumpy[start] == 1) {
                        windowSum = windowSum - customers[start];
                    }
                    start++;
                }
                maxSum = Math.max(maxSum, windowSum);
                end++;
            }
            return initialSum + maxSum;
        }
    }
}
