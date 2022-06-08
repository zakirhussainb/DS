package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_189 {
    static class Solver {
        public int[] solve1(int[] arr, int k) {
            int n = arr.length;
            while(k --> 0) {
                int m = arr[n - 1];
                int i = n - 1;
                for(; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[i] = m;
            }
            return arr;
        }
        public int[] solve2(int[] arr, int k) {
            // speed up the rotation
            k %= arr.length;
            int temp, previous;
            for (int i = 0; i < k; i++) {
                previous = arr[arr.length - 1];
                for (int j = 0; j < arr.length; j++) {
                    temp = arr[j];
                    arr[j] = previous;
                    previous = temp;
                }
            }
            return arr;
        }
    }
    static class Solver1 {
        public int[] solve(int[] arr, int k) {
            int n = arr.length;
            k = k % n;
            // Reverse the entire array
            reverse(arr, 0, n - 1);
            // Reverse the first k numbers
            reverse(arr, 0, k - 1);
            // Reverse the last n - k numbers, i.e from k to n - 1
            reverse(arr, k, n - 1);

            return arr;
        }
        private void reverse(int[] arr, int start, int end) {
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
