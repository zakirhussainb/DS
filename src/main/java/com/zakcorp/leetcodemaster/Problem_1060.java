package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1060 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            int n = arr.length;
            int[] hash = new int[arr[n - 1] + 1];
            for(int num : arr) {
                hash[num]++;
            }
            int i;
            for(i = arr[0];  i < hash.length; i++) {
                if(hash[i] == 0) {
                    k--;
                }
                if(k == 0) {
                    return i;
                }
            }
            while(k --> 0) {
                ++i;
            }
            return i - 1;
        }
        public int solve2(int[] arr, int k) {
            int n = arr.length;
            for(int i = 1; i < n; i++) {
                int diff = arr[i] - arr[i - 1] - 1;
                if(diff >= k) {
                    return arr[i - 1] + k;
                }
                k = k - diff;
            }
            return arr[n - 1] + k;
        }
    }
}
