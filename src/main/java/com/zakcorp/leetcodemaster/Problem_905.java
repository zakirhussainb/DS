package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem_905 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int[] result = new int[arr.length];
            int k = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    result[k++] = num;
                }
            }
            for (int num : arr) {
                if (num % 2 != 0) {
                    result[k++] = num;
                }
            }
            return result;
        }
        public int[] solve2(int[] arr) {
            int k = 0;
            for(int i = 0; i < arr.length; i++) {
                if((arr[i] & 1) != 1) {
                    int val = arr[k];
                    arr[k] = arr[i];
                    arr[i] = val;
                    k++;
                }
            }
            return arr;
        }
    }
}
