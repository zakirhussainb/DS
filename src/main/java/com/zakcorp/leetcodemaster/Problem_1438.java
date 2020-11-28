package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1438 {
    static class Solver {
        // Good Solution. But TLE
        public int solve1(int[] arr, int limit) {
            int n = arr.length;
            int windowMin, windowMax;
            int maxLen = 0;
            for(int i = 0; i < n; i++) {
                windowMax = arr[i]; windowMin = arr[i];
                for(int j = i; j < n; j++) {
                    windowMax = Math.max(windowMax, Math.max(arr[i], arr[j]) );
                    windowMin = Math.min(windowMin, Math.min(arr[i], arr[j]) );
                    int abs = Math.abs(windowMax - windowMin);
                    if(abs <= limit) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            return maxLen;
        }
        public int solve2(int[] arr, int limit) {
            // Using TreeMap -> Time O(log N) and Space O(N)
            int start = 0, end, n = arr.length;
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for(end = 0; end < n; end++) {
                treeMap.put(arr[end], treeMap.getOrDefault(arr[end], 0) + 1);
                if(treeMap.lastEntry().getKey() - treeMap.firstEntry().getKey() > limit) {
                    treeMap.put(arr[start], treeMap.get(arr[start]) - 1);
                    treeMap.remove(arr[start], 0);
                    start++;
                }
            }
            return end - start;
        }
        public int solve3(int[] arr, int limit) {
            // Using Two Deque's
            Deque<Integer> dequeMax = new LinkedList<>();
            Deque<Integer> dequeMin = new LinkedList<>();
            int start = 0, end, n = arr.length;
            for(end = 0; end < n; end++) {
                while( !dequeMax.isEmpty() && arr[end] > dequeMax.peekLast() ) {
                    dequeMax.pollLast();
                }
                while( !dequeMin.isEmpty() && arr[end] < dequeMin.peekLast() ) {
                    dequeMin.pollLast();
                }
                dequeMax.addLast(arr[end]);
                dequeMin.addLast(arr[end]);
                if(dequeMax.peek() - dequeMin.peek() > limit) {
                    if(dequeMax.peek() == arr[start]) {
                        dequeMax.poll();
                    }
                    if(dequeMin.peek() == arr[start]) {
                        dequeMin.poll();
                    }
                    start++;
                }
            }
            return end - start;
        }
    }
}
