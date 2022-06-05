package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr) {
            return recur(arr, arr.length);
        }
        private int recur(int[] arr, int n) {
            if(n == 1) {
                return arr[0];
            }
            int[] newNums = new int[n / 2];
            for(int j = 0; j < n / 2; j++) {
                if(j % 2 == 0) {
                    newNums[j] = Math.min( arr[2 * j], arr[2 * j + 1] );
                } else {
                    newNums[j] = Math.max( arr[2 * j], arr[2 * j + 1] );
                }
            }
            arr = newNums;
            return recur(arr, arr.length);
        }
    }
}
