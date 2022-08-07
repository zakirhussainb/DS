package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1630 {
    static class Solver {
        public List<Boolean> solve1(int[] arr, int[] l, int[] r) {
            List<Boolean> output = new ArrayList<>();
            for(int i = 0; i < l.length; i++) {
                int[] temp = Arrays.copyOf(arr, arr.length);
                Arrays.sort(temp, l[i], r[i] + 1);
                output.add(isArithmetic(temp, l[i], r[i] + 1));
            }
            return output;
        }
        private boolean isArithmetic(int[] arr, int start, int end) {
            int diff = arr[start + 1] - arr[start];
            for(int i = start + 2; i < end; i++) {
                if(arr[i] - arr[i - 1] != diff) {
                    return false;
                }
            }
            return true;
        }
    }
}
