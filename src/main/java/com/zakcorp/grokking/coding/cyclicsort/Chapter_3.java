package com.zakcorp.grokking.coding.cyclicsort;

public class Chapter_3 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int orgSum = 0;
            for(int i = 0; i <= n; i++) {
                orgSum += i;
            }
            int actSum = 0;
            for (int num : arr) {
                actSum += num;
            }
            return orgSum - actSum;
        }
    }
}
