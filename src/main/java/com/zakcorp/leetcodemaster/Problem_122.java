package com.zakcorp.leetcodemaster;

public class Problem_122 {
    static class Solver {
        public int maxProfit(int[] pricesArr) {
            int n = pricesArr.length;
            int maxProfit = 0;
            for(int i = 1; i < n; i++) {
                if(pricesArr[i] > pricesArr[i - 1]) {
                    maxProfit += pricesArr[i] - pricesArr[i - 1];
                }
            }
            return maxProfit;
        }
    }
}
