package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1846 {
    static class Solver {
        public int solve1(int[] arr) {
            Arrays.sort(arr);
            arr[0] = 1;
            for(int i = 1; i < arr.length; i++) {
                int val = arr[i] - arr[i - 1];
                if(val > 1) {
                    arr[i] = arr[i - 1] + 1;
                }
            }
            return arr[arr.length - 1];
        }
        // More optimised solution
        public int solve2(int[] arr) {
            Arrays.sort(arr);
            int max = 0;
            for(int num : arr) {
                if(num > max) {
                    max++;
                }
            }
            return max;
        }
    }
}
