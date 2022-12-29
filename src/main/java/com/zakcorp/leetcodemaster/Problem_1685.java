package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_1685
{
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int[] res = new int[n];
            for(int i = 0; i < n; i++) {
                res[0] += arr[i] - arr[0];
            }
            for(int i = 1; i < n; i++) {
                int noOfElementsBefore = i;
                int noOfElementsAfter = n - i;
                int diff = arr[i] - arr[i - 1];
                res[i] = res[i - 1] +
                         noOfElementsBefore * diff -
                         noOfElementsAfter * diff;
            }
            return res;
        }
    }
}
