package com.zakcorp.leetcodemaster;

public class Problem_26 {
    static class Solver {
        public int removeDuplicates(int[] arr) {
            int i = arr.length > 0 ? 1 : 0;
            for(int n : arr) {
                if(n > arr[i - 1]) {
                    arr[i++] = n;
                }
            }
            return i;
        }
    }
}
