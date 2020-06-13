package com.zakcorp.leetcodemaster;

public class Problem_1470 {
    static class Solver {
        public int[] shuffle(int[] arr, int n) {
            int[] res = new int[arr.length];
            int i = 0;
            int j = n;
            int k = -1;
            while(i < n) {
                res[++k] = arr[i++];
                res[++k] = arr[j++];
            }
            return res;
        }
    }

}
