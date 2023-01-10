package com.zakcorp.leetcodemaster;

public class Problem_2104
{
    static class Solver {
        public long solve1(int[] arr) {
            long sum = 0;
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                long max = arr[i];
                long min = arr[i];
                for(int j = i + 1; j < n; j++) {
                    max = Math.max(max, arr[j]);
                    min = Math.min(min, arr[j]);
                    sum += max - min;
                }
            }
            return sum;
        }
    }
}
