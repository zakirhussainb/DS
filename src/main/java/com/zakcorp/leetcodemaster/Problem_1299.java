package com.zakcorp.leetcodemaster;

public class Problem_1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int max = Integer.MIN_VALUE;
        res[n - 1] = -1;
        for(int i = n - 1; i > 0; i--) {
            max = Math.max(max, arr[i]);
            res[i - 1] = max;
        }
        return res;
    }
}
