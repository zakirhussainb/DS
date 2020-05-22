package com.zakcorp.algorithms.greedy.gfg;

import java.util.Arrays;

public class KnapsackProblem {
    static class FractionalKnapSack {
        public static void main(String[] args) {
            int[] weight = {10, 40, 20, 30};
            int[] value = {60, 40, 100, 120};
            int capacity = 50;
            System.out.println(getMaximumProfit(weight, value, capacity));
        }
        private static int getMaximumProfit(int[] weight, int[] value, int capacity) {
            int n = weight.length;
            int[] profit = new int[n];
            for(int i = 0; i < n; i++) {
                profit[i] = value[i] / weight[i];
            }
            Arrays.sort(profit);
            return 0;
        }
    }
}
