package com.zakcorp.leetcodemaster;

public class Problem_283 {
    static class Solver {
        public int[] moveZeroes(int[] arr) {
            int n = arr.length;
            int i = 0, j = 1;
            while(j < n) {
                if(arr[i] == 0 && arr[j] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++; j++;
                } else if(arr[i] == 0 && arr[j] == 0) {
                    j++;
                } else {
                    i++; j++;
                }
            }
            return arr;
        }
        public int[] solve2(int[] arr) {
            int n = arr.length;
            int k = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] != 0) {
                    arr[k++] = arr[i];
                }
            }
            for(int i = k; i < n; i++) {
                arr[i] = 0;
            }
            return arr;
        }
    }
}
