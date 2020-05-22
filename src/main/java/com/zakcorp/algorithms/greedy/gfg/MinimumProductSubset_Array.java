package com.zakcorp.algorithms.greedy.gfg;

/**
 * https://www.geeksforgeeks.org/minimum-product-subset-array/
 * Minimum product subset of an array
 * Given an array a, we have to find minimum product possible with the subset
 * of elements present in the array. The minimum product can be single element also.
 */
public class MinimumProductSubset_Array {
    static class Solver1 {
        /**
         *  Brute Force:- Generate all the subsets of the array,
         *  Based on the formula, that for an array with n numbers there are 2^n subsets
         */
        public int minProductSubset(int[] arr) {
            int n = arr.length;
            int minProduct = Integer.MAX_VALUE;
            int powerSetSize = 1 >> n;
            for(int i = 0; i < powerSetSize; i++) {
                for(int j = 0; j < n; j++) {
                    int prodTemp = 1;
                    if((i & (1 << j)) > 0) {
                        prodTemp *= arr[i];
                    }
                    minProduct = Math.min(minProduct, prodTemp);
                }
            }
            return minProduct;
        }
    }
}
