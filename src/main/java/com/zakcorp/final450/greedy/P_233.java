package com.zakcorp.final450.greedy;

public class P_233 {
    static class Solver {
        // It is a naive solution, producing TLE for large inputs
        public int solve1(int[] arr) {
            int n = arr.length;
            int pro, maxPro = arr[0];
            for(int i = 1; i < n; i++) {
                pro = arr[i];
                for(int j = i; j < n; j++) {
                    if(i != j) {
                        pro *= arr[j];
                    }
                }
                maxPro = Math.max(maxPro, pro);
            }
            return maxPro;
        }
    }
}
