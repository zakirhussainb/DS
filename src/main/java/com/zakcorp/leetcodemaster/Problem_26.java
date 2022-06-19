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
        public int solve2(int[] arr) {
            int n = arr.length;
            int i = 0, j = 1;
            while(j < n) {
                if(arr[i] != arr[j]) {
                    arr[i + 1] = arr[j];
                    i = i + 1;
                }
                j++;
            }
            return i + 1;
        }
    }
}
