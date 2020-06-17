package com.zakcorp.leetcodemaster;

public class Problem_27 {
    static class Solver {
        public int removeElement(int[] arr, int val) {
            int k = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != val) {
                    arr[k++] = arr[i];
                }
            }
            return k;
        }
    }
}
