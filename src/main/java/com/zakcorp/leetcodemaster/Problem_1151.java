package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1151 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int totalOnes = 0;
            for (int num : arr) {
                totalOnes += num;
            }
            int start = 0, end = 0;
            int windowOnes = 0, maxOnes = 0;
            while(end < n) {
                windowOnes += arr[end++];
                if( end - start > totalOnes) {
                    windowOnes = windowOnes - arr[start];
                    start++;
                }
                maxOnes = Math.max(maxOnes, windowOnes);
            }
            return totalOnes - maxOnes;
        }
        public int solve2(int[] arr) {
            int totalOnes = 0;
            for(int num : arr)
                totalOnes += num;

            Deque<Integer> deque = new ArrayDeque<>();
            int windowOnes = 0, maxOnes = 0;
            for (int num : arr) {
                deque.addLast(num);
                windowOnes += num;
                if (deque.size() > totalOnes) {
                    windowOnes = windowOnes - deque.removeFirst();
                }
                maxOnes = Math.max(maxOnes, windowOnes);
            }
            return totalOnes - maxOnes;
        }
    }
}
