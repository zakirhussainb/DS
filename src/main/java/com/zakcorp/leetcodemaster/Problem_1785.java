package com.zakcorp.leetcodemaster;

public class Problem_1785 {
    static class Solver {
        public int solve1(int[] arr, int limit, int goal) {
            long sum = 0, diff;
            for (int a : arr)
                sum += a;
            diff = Math.abs(goal - sum);
            return (int)((diff + limit - 1) / limit);
        }
    }
}
