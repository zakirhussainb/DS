package com.zakcorp.leetcodemaster;

public class Problem_746 {
    static class Solver {
        public int solve1(int[] cost) {
            return Math.min(findCost(cost, 0), findCost(cost, 1));
        }
        private int findCost(int[] cost, int index) {
            int minCost = 0;
            int n = cost.length;
            int j = 1;
            while(index < n && j < n) {
                int cost1 = cost[index] + cost[j];
                int cost2 = cost[index] + cost[j + 1];
                if(cost1 < cost2) {
                    minCost += cost1;
                    index = j;
                } else {
                    minCost += cost2;
                    index = j + 1;
                    j = j + 2;
                }
            }
            return minCost;
        }
    }
}
