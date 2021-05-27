package com.zakcorp.final450.searchingandsorting;

public class P_105 {
    static class Solver {
        // O(N ^ 2) time and O(1) space
        public long[] solve1(int[] arr, int n)
        {
            long[] pro = new long[n];
            for(int i = 0; i < n; i++) {
                pro[i] = 1L;
                for(int j = 0; j < n; j++) {
                    if(i != j) {
                        pro[i] *= arr[j];
                    }
                }
            }
            return pro;
        }
    }
}
