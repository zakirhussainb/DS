package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
    static class Solver {
        public double solve1(int[] nums1, int[] nums2) {
            int[] arr = mergeSortedArrays(nums1,  nums2);
            return findMedian(arr);
        }
        private int[] mergeSortedArrays(int[] a1, int[] a2) {
            int m = a1.length;
            int n = a2.length;
            int[] res = new int[m + n];
            int i = 0, j = 0, k = 0;
            while(i < m && j < n) {
                if(a1[i] <= a2[j]) {
                    res[k++] = a1[i++];
                } else {
                    res[k++] = a2[j++];
                }
            }
            while(i < m) {
                res[k++] = a1[i++];
            }
            while(j < n) {
                res[k++] = a2[j++];
            }
            return res;
        }
        private double findMedian(int[] arr) {
            int n = arr.length;
            // if n is even, ( (n / 2) + ( (n + 1) / 2 ) ) / 2
            // if n is odd, (n + 1) / 2
            if(n % 2 == 0) {
                double r1 = (double) n / 2;
                double r2 = (double) (n + 1) / 2;
                return (r1 + r2) / 2;
            } else {
                return (double)(n + 1) / 2;
            }
        }
    }
}
