package com.zakcorp.leetcodemaster;

public class Problem_88 {
    static class Solver {
        public int[] solve1(int[] arr1, int m, int[] arr2, int n) {
            int i = m - 1, j = n - 1;
            int k = arr1.length - 1;
            while(i >= 0 && j >= 0) {
                if(arr1[i] <= arr2[j]) {
                    arr1[k] = arr2[j];
                    j--;
                } else {
                    arr1[k] = arr1[i];
                    i--;
                }
                k--;
            }
            while(j >= 0) {
                arr1[k--] = arr2[j--];
            }
            return arr1;
        }
    }
}
