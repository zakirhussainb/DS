package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_2161 {
    static class Solver {
        public int[] solve1(int[] arr, int pivot) {
            int n = arr.length;
            int[] res = new int[n];
            int k = 0;
            for (int num : arr) {
                if (num < pivot) {
                    res[k++] = num;
                }
            }
            for (int num : arr) {
                if (num == pivot) {
                    res[k++] = num;
                }
            }
            for (int num : arr) {
                if (num > pivot) {
                    res[k++] = num;
                }
            }
            return res;
        }
        public int[] solve2(int[] arr, int pivot) {
            int n = arr.length;
            int[] res = new int[n];
            int k = 0;
            int pivotCount = 0;
            for (int num : arr) {
                if (num < pivot) {
                    res[k++] = num;
                } else if(num == pivot) {
                    pivotCount++;
                }
            }
            while(pivotCount --> 0) {
                res[k++] = pivot;
            }
            for (int num : arr) {
                if (num > pivot) {
                    res[k++] = num;
                }
            }
            return res;
        }
    }
}
