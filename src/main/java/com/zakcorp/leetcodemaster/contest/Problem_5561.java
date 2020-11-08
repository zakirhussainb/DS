package com.zakcorp.leetcodemaster.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_5561 {
    static class Solver {
        public int solve1(int n) {
            if(n == 0) {
                return n;
            }
            int[] arr = new int[n + 1];
            arr[0] = 0; arr[1] = 1;
            for(int i = 1; i < arr.length; i++) {
                if((2 * i) > n || (2 * i + 1) > n) {
                    break;
                }
                arr[(i * 2)]  = arr[i];
                arr[(i * 2) + 1] = arr[i] + arr[i + 1];
            }
            int max = Integer.MIN_VALUE;
            for (int value : arr) {
                max = Math.max(max, value);
            }
            return max;
        }
    }
}
