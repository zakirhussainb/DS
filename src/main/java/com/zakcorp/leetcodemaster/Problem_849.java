package com.zakcorp.leetcodemaster;


public class Problem_849 {
    public int maxDistToClosest(int[] arr) {
        int n = arr.length;
        int max = 1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                if(i > 0 && i < n - 1) {
                    if(arr[i - 1] == 0 && arr[i + 1] == 0) {
                        max = Math.max(max, i);
                    }
                } else {
                    max = Math.max(max, i);
                }
            }
        }
        return max;
    }
}
